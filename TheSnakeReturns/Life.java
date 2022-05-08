import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import greenfoot.Font;
import greenfoot.Color;

/**
 * The Class Score is an Actor and implements ScoreObserver, when score changes, level state machine is notified and level is updated.
 * Also used to update text displayed for score and level.
 */
public class Life extends Actor implements ILifeObserver {

    int life = 3;
    Font font = new Font("Dialog",true,false,40);
    Color darkGreen = new Color(0, 51, 0);
    Color green = new Color(0, 255, 0 , 150);


    public void setText() {
        String text = "Life: " + life;
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.GREEN, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(800, 60);
        image.drawImage(textImage, 750, 16);
        setImage(image);
    }

    public Life() {
        setText();
    }

    /**
     * returns updated score value
     */
    public int getLife(){
        return life;
    }

    /**
     * Act.
     */
    public void act() {

    }

    @Override
    public void updateLife() {
        this.life--;
        setText();
    }
}
