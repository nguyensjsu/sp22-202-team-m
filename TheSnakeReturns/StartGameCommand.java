/**
 * Write a description of class StartGameCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGameCommand implements Command 
{
    final GameController controller;
    /**
     * Constructor for objects of class StartGameCommand
     */
    public StartGameCommand(GameController controller)
    {
        this.controller = controller;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void execute()
    {
        controller.startGame();
    }
}
