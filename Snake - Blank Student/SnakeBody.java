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
    
    // body
    private GreenfootImage horizontal;
    //private GreenfootImage vertical;
    //private GreenfootImage topLeft;
    //private GreenfootImage topRight;
    //private GreenfootImage bottomLeft;
    //private GreenfootImage bottomRight;
    
    // tail
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
        horizontal = new GreenfootImage("body_horizontal.png");
        //vertical = new GreenfootImage("body_vertical.png");
        //topLeft = new GreenfootImage("body_topleft.png");
        //topRight = new GreenfootImage("body_topright.png");
        //bottomLeft = new GreenfootImage("body_bottomleft.png");
        //bottomRight = new GreenfootImage("body_bottomright.png");
        up = new GreenfootImage("tail_up.png");
        down = new GreenfootImage("tail_down.png");
        left = new GreenfootImage("tail_left.png");
        right = new GreenfootImage("tail_right.png");
        
        horizontal.scale(16,16);
        up.scale(16,16);
        down.scale(16,16);
        left.scale(16,16);
        right.scale(16,16);
        
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
      // body behind & in front of current coords
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
        setImage(horizontal);
      }      
      
      setLocation(snakeCoords.getX(), snakeCoords.getY());
    }
}
