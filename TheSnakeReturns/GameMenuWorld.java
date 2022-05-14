import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenuWorld extends World
{
    private final GameController controller;
    /**
     * Constructor for objects of class GameMenuWorld.
     * 
     */
    public GameMenuWorld(GameController controller)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(controller.SCREEN_WIDTH, controller.SCREEN_HEIGHT, controller.SCREEN_CELLSIZE);
        this.controller = controller;
        
        setBackground(new GreenfootImage("background/tropical.png"));
        
        GreenfootImage boardImage = new GreenfootImage("display/title.png");
        boardImage.scale(320, 120);
        getBackground().drawImage(boardImage, 240, 100);
        
        Command startGameCmd = new StartGameCommand(controller);
        Button startGameButton = new Button(startGameCmd, "buttons/start.png", 200, 60);
        addObject(startGameButton, 39, 28); // hard-set position (53,3) for now
    }
}
