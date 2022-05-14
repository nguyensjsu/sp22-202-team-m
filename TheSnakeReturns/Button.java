import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    final Command command;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Button(Command command, String imagePath, int width, int height) {
        // setup button display
        GreenfootImage image = new GreenfootImage(imagePath);
        image.scale(width, height);
        setImage(image);
        // setup command
        this.command = command;
    }
    
     
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            command.execute();
        }
    }
}
