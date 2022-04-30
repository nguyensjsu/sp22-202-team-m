import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import greenfoot.Color;
/**
 * Write a description of class SnakeBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeBody  extends Actor
{
    private int x_speed=1;
    private int y_speed=0;
    private int bodyPos;
    private Point snakeCoords;

    private GreenfootImage horizontal;
    private GreenfootImage vertical;
    private GreenfootImage up;
    private GreenfootImage down;
    private GreenfootImage left;
    private GreenfootImage right;

    /**
     * SnakeBody constructor
     * sets the image for the snakeBody
     * @param int bodyPosition
     */
    public SnakeBody(int bodyPosition)
    {
        horizontal = new GreenfootImage("snake/body_horizontal.png");
        vertical = new GreenfootImage("snake/body_vertical.png");
        up = new GreenfootImage("snake/tail_up.png");
        down = new GreenfootImage("snake/tail_down.png");
        left = new GreenfootImage("snake/tail_left.png");
        right = new GreenfootImage("snake/tail_right.png");

        horizontal.scale(12,12);
        vertical.scale(12,12);
        up.scale(12,12);
        down.scale(12,12);
        left.scale(12,12);
        right.scale(12,12);
        
        setImage(horizontal);     
        
        bodyPos = bodyPosition;
    }

    /**
     * Act - do whatever the SnakeBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveBody();
    }    

    /**
     * moveBody
     * moves the snake body 
     */
    public void moveBody()
    {
      SnakeWorld world = (SnakeWorld)getWorld();
      snakeCoords = world.getBodyPosition(bodyPos);

      Point behind = world.getBodyPosition(bodyPos+1);
      Point front = world.getBodyPosition(bodyPos-1);
      
      // check if tail
      if (behind == null) {
        if      (getX() > front.getX()) setImage(right);
        else if (getX() < front.getX()) setImage(left);
        else if (getY() < front.getY()) setImage(up);
        else if (getY() > front.getY()) setImage(down);  
      } else {
        // only use horizontal image for now
        if (getX() == front.getX()) setImage(vertical);
        else setImage(horizontal);
      }

      setLocation(snakeCoords.getX(), snakeCoords.getY());
    }
}
