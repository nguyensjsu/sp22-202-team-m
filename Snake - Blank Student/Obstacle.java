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
    public Obstacle()
    {
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.RED);
        image.fillRect(0, 0, 10, 10);
        setImage(image);
    }

}