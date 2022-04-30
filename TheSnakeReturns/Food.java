import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food  extends Actor
{

    /**
     * Constructor Food
     * Sets the image for the food class
     */
    public Food(String name)
    {
        GreenfootImage image = new GreenfootImage(name);
        image.scale(30, 30);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

}
