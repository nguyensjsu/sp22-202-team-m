import greenfoot.Greenfoot;
import greenfoot.World;
import greenfoot.GreenfootImage;
/**
 * Write a description of class SnakeWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnakeWorld extends World implements ILevelObserver {
    //food creation variables
    public static final int DOT_SIZE = 10;
    public static final int MAX_DOTS = (200 * 100) / (DOT_SIZE * DOT_SIZE);
    private int snakeSize = 4;
    private final Point[] snakeCoords = new Point[MAX_DOTS];
    int dX = 1, dY = 0;

    // backgrounds
    private String[] backgroundPaths = new String[] { "background/grass.jpg", "background/ground.jpg", "background/wood.jpg", "background/bricks.jpg", "background/grass-night.jpg" };

    Factory foodFactory;
    Factory obstacleFactory;
    //Direction variables
    private final int SPEED = 1;
    private int directionX = SPEED;
    private int directionY;

    //Level State Machine variable
    LevelState state;

    //Score variable
    Score score;

    //Endgame variable
    EndGame endgame;

    //intial speed variable
    private int speed = 30;

    //value variable
    private static int value = 0;

    private int worldWidth = 60;

    private int worldHeight = 40;

    /**
     * Constructor for objects of class SnakeWorld.
     */
    public SnakeWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(61, 41, 10);
        
        setBackground(new GreenfootImage(backgroundPaths[0]));

        setUpCoords();
        drawSnake();
        
        foodFactory = new FoodFactory();
        obstacleFactory = new ObstacleFactory();
        placeFood(1);

        
        placeObstacles(1);
        addObject(new WorldOutline(), 30, 20);
        Greenfoot.setSpeed(speed);


        state = new LevelState();

        // make World observe LevelState
        state.attach(this);

        score = new Score();
        state.changeToLevel1();
        score.attachObserver(state);
        addObject(score, 6, 2);

    }

    /**
     * Level State Machine instance
     */
    public LevelState getState() {
        return state;
    }

    /**
     * upDateCoords
     * Updates the coordinates of the snake to its new spot as it moves on the screen
     */
    public void updateCoords() {

        for (int i = snakeSize - 1; i > 0; i--) {

            snakeCoords[i].setX(snakeCoords[i - 1].getX());
            snakeCoords[i].setY(snakeCoords[i - 1].getY());

        }
        snakeCoords[0].setX(snakeCoords[0].getX() + directionX);
        snakeCoords[0].setY(snakeCoords[0].getY() + directionY);
    }

    /**
     * drawSnake
     * Draws the snake at its starting position
     */
    public void drawSnake() {
        addObject(new SnakeHead(0), snakeCoords[0].getX(), snakeCoords[0].getY());
        for (int i = snakeSize - 1; i > 0; i--) {
            addObject(new SnakeBody(i), snakeCoords[i].getX(), snakeCoords[i].getY());
        }
    }

    /**
     * placeFood
     * Place a set amount of food in the game window
     *
     * @param int amountOfFood
     */
    public void placeFood(int amountOfFood) {
        for (int i = 0; i < amountOfFood; i++) {
            addObject(foodFactory.sendItem(), Greenfoot.getRandomNumber(worldWidth - 6) + 3, Greenfoot.getRandomNumber(worldHeight - 6) + 3);
        }
    }

    /**
     * placeFood
     * Place a set amount of food in the game window
     *
     * @param int amountOfFood
     */
    public void placeObstacles(int amountOfObstacles) {
        for (int i = 0; i < amountOfObstacles; i++) {
            addObject(obstacleFactory.sendItem(), Greenfoot.getRandomNumber(worldWidth - 6) + 3 , Greenfoot.getRandomNumber(worldHeight - 6) + 3);
        }
    }


    /**
     * setUpCoords
     * sets up the snake coordinates at the start of the game
     */
    public void setUpCoords() {
        snakeCoords[0] = new Point(getWidth() / 2, getHeight() / 2);
        for (int i = 1; i < snakeSize; i++) {
            snakeCoords[i] = new Point(snakeCoords[i - 1].getX() - 1, snakeCoords[i - 1].getY());
        }
    }

    /**
     * addTail
     * adds another tail to the end of the snake
     * Do not change value, needs to be set after setting new score.
     * After incrementing value, instanciate new object for end game @ certain score
     */
    public void addTail() {
        snakeCoords[snakeSize] = new Point(snakeCoords[snakeSize - 1].getX(), snakeCoords[snakeSize - 1].getY());
        addObject(new SnakeBody(snakeSize), snakeCoords[snakeSize].getX(), snakeCoords[snakeSize].getY());
        snakeSize++;
        score.updateScore(state.getState());
        value = score.getScore();
        //add new end game instance
        if (value == 30) {
            endGame();
        }
        System.out.println("Score===" + value);
        speed++;
        Greenfoot.setSpeed(speed);
    }

    //not used
    public static int getValue() {
        return value;
    }


    /**
     * keyPress
     * changes the direction of the snake based upon key presses
     */
    public void keyPress() {
        if (Greenfoot.isKeyDown("up") && directionY != SPEED) {
            directionY = -SPEED;
            directionX = 0;
        }
        if (Greenfoot.isKeyDown("down") && directionY != -SPEED) {
            directionY = SPEED;
            directionX = 0;
        }
        if (Greenfoot.isKeyDown("left") && directionX != SPEED) {
            directionX = -SPEED;
            directionY = 0;
        }
        if (Greenfoot.isKeyDown("right") && directionX != -SPEED) {
            directionX = SPEED;
            directionY = 0;
        }
    }

    /**
     * getBodyPosition
     * returns the coordinates of the snake at the passed in body position
     *
     * @param int bodyPosition
     */
    public Point getBodyPosition(int bodyPosition) {
        if (bodyPosition>=0 && bodyPosition<snakeCoords.length)
            return snakeCoords[bodyPosition];
        else
            return null;
    }

    /**
     * die - ends the game
     */
    public void die() {
        Greenfoot.playSound("GameOver.wav");
        addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }

    /**
     * endGame - ends the game
     */
    public void endGame() {
        addObject(new EndGame(), getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }


    /**
     * hitEdge - game over if you hit the side of the world
     */
    public void hitEdge() {
        if (snakeCoords[0].getX() < 1 || snakeCoords[0].getX() > getWidth() - 2 || snakeCoords[0].getY() < 1 || snakeCoords[0].getY() > getHeight() - 2) {
            die();
        }
    }

    public void act() {
        keyPress();
        updateCoords();
        hitEdge();
    }

    public void update(int speed, int level) {
        setBackground(new GreenfootImage(backgroundPaths[level-1]));
        Greenfoot.setSpeed(speed);
    }

}
