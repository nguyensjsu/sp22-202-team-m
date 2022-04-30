import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{

    /**
     * Constructor Food
     * Sets the image for the food class
     */
    public Obstacle(String name)
    {        
        GreenfootImage image = new GreenfootImage(name);
        image.scale(30, 30);
        setImage(image);
    }

}
