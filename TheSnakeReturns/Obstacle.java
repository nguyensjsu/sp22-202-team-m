import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Obstacle extends Actor {

    /**
     * Constructor Obstacle
     * Sets the image for the obstacle class
     */
    private static final int OBSTACLE_SIZE = 40;

    public Obstacle(String name) {
        GreenfootImage image = new GreenfootImage(name);
        image.scale(OBSTACLE_SIZE, OBSTACLE_SIZE);
        setImage(image);
    }

    public static int getSize() {
        return OBSTACLE_SIZE / 10;
    }
}
