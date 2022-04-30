import greenfoot.*;  

// TODO: Auto-generated Javadoc
/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Food
{
    
    /** The banana consumed. */
    public static int bananaConsumed=0;
    
    /**
     * Instantiates a new banana.
     */
    public Banana(){
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.YELLOW);
        image.fillRect(0, 0, 10, 10);
        setImage(image);  
    }
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
}
