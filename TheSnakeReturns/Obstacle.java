import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

public class Obstacle extends Actor
{

    /**
     * Constructor Obstacle
     * Sets the image for the obstacle class
     */
    public Obstacle(String name)
    {        
        GreenfootImage image = new GreenfootImage(name);
        image.scale(30, 30);
        setImage(image);
    }

}
