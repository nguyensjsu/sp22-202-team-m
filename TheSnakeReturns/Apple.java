import greenfoot.*;  

// TODO: Auto-generated Javadoc
/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food
{
    
    /** The apple consumed. */
    public static int appleConsumed=0;
    
    /**
     * Instantiates a new apple.
     */
    public Apple(){
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.BLUE);
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
