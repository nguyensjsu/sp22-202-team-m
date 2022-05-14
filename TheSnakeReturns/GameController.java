import greenfoot.Greenfoot;
import greenfoot.World;

/**
 * Write a description of class GameController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameController  
{
    // instance variables - replace the example below with your own
    public static final int SCREEN_WIDTH = 80;
    public static final int SCREEN_HEIGHT = 60;
    public static final int SCREEN_CELLSIZE = 10;
    
    /**
     * Constructor for objects of class GameController
     */
    public GameController()
    {   
        final World menuWorld = new GameMenuWorld(this);
        Greenfoot.setWorld(menuWorld);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void startGame()
    {
        Greenfoot.setWorld(new SnakeWorld(this));
    }
    
        /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setGameOver(int score)
    {
        // put your code here
        Greenfoot.playSound("GameOver.wav");
        Greenfoot.setWorld(new GameOverWorld(this, score));
    }
}
