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
    public Food()
    {
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.GREEN);
        image.fillRect(0, 0, 10, 10);
        setImage(image);
    }

}
