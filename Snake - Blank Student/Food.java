import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import greenfoot.Color;

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
        image.setColor(Color.RED);
        image.fillRect(0, 0, 10, 10);
        setImage(image);
    }

}
