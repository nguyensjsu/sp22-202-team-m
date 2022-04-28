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
        GreenfootImage image = new GreenfootImage("apple.png");
        //image.scale(20,20);
        setImage(image);
    }

}
