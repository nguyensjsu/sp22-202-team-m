import greenfoot.*;

import java.util.ArrayList;

/**
 * Write a description of class SnakeHead here.
 * //  *
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnakeHead extends Actor {
//    private int bodyPos;
//    private int temp = 0;

    private final GreenfootImage up;
    private final GreenfootImage down;
    private final GreenfootImage left;
    private final GreenfootImage right;
    SnakeWorld world;
    boolean obstacleExists = false;

    /**
     * SnakeHead Constructor
     * Sets the image for snakeHead
     *
     * @param int bodyPosition
     */
    public SnakeHead(int bodyPosition) {
        up = new GreenfootImage("snake/head_up.png");
        down = new GreenfootImage("snake/head_down.png");
        left = new GreenfootImage("snake/head_left.png");
        right = new GreenfootImage("snake/head_right.png");

        up.scale(20, 20);
        down.scale(20, 20);
        left.scale(20, 20);
        right.scale(20, 20);
        setImage(right);
        world = (SnakeWorld) getWorld();
    }

    /**
     * Act - do whatever the SnakeHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveHead();
        lookForFood();
        hitBody();
        hitObstacle();
    }

    /**
     * moveHead
     * moves the head to the next position on the screen
     */
    public void moveHead() {
        SnakeWorld world = (SnakeWorld) getWorld();
        Point snakeCoords = world.getBodyPosition(0);
        if (getX() > snakeCoords.getX()) setImage(left);
        else if (getX() < snakeCoords.getX()) setImage(right);
        else if (getY() < snakeCoords.getY()) setImage(down);
        else if (getY() > snakeCoords.getY()) setImage(up);
        setLocation(snakeCoords.getX(), snakeCoords.getY());
    }

    /**
     * growTail
     * adds a tail segment to the snake and adds new food to the world
     */
    public void growTail() {
        SnakeWorld world = (SnakeWorld) getWorld();
        world.addTail();
        world.placeFood(1);
        world.placeObstacles(1);
    }

    /**
     * lookForFood
     * Looks for food.
     * If the snake finds food it eats the food
     */
    public void lookForFood() {
        if (canSee(Food.class)) {
            Greenfoot.playSound("eat.wav");
            eat(Food.class);
            growTail();
        }
    }

    /**
     * hitBody - checks whether the snake tries to eat it's own body
     */
    public void hitBody() {
        SnakeWorld world = (SnakeWorld) getWorld();
        if (canSee(SnakeBody.class)) {
            world.die();
        }
    }

    public void hitObstacle() {
        SnakeWorld world = (SnakeWorld) getWorld();
        if (!isAlive()) {
            world.die();
        }
        if (canSee(Obstacle.class) && !obstacleExists) {
            obstacleExists = true;
            world.notifyLifeObserver();
        } else if (canSee(Obstacle.class) && obstacleExists) {
            // do no
        } else {
            obstacleExists = false;
        }
    }

    /**
     * canSee
     * looks for other objects the intersect with the snake
     *
     * @param Class clss
     */
    public boolean canSee(Class a) {
        Actor actor = getOneObjectAtOffset(0, 0, a);
        return actor != null;
    }

    /**
     * eat
     * eats the object and removes it from the screen
     *
     * @param Class clss
     */
    public void eat(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if (actor != null) {
            getWorld().removeObject(actor);
        }
    }

    public boolean isAlive() {
        SnakeWorld world = (SnakeWorld) getWorld();
        return world.life.getLife() > 0;
    }
}
