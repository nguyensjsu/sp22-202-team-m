
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import greenfoot.Font;
import greenfoot.Color;

public class EndGame extends Actor
{

    //(font type,bold,italic,size)
    Font font = new Font("Dialog",true,false,40);
    Color darkGreen = new Color(0, 51, 0);
    Color green = new Color(0, 255, 0 , 150);

    public void setText(){

    GreenfootImage image = new GreenfootImage(300, 100);
        image.setFont(font);
        image.setColor(darkGreen);
        image.drawString("You Win", ShiftEast(1, 2), ShiftSouth(50, 2));
        image.setColor(green);
        image.drawString("You Win", 1, 50);
        setImage(image);
    }


    public EndGame()
    {
        setText();

    }


    /**
     * ShiftSouth -shifts the coordnates down by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftSouth(int p, int distance) {
        return (p + distance);
    }

    /**
     * ShiftEast - shifts the coordinates right by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftEast(int p, int distance) {
        return (p + distance);
    }

}
