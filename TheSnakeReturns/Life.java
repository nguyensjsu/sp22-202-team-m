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
    
    static private String[] lifeImagePaths = new String[]{"display/life-0.png", "display/life-1.png", "display/life-2.png", "display/life-3.png"};

    public void setText() {
        GreenfootImage image = new GreenfootImage(lifeImagePaths[life]);
        image.scale(132,36);
        setImage(image);
    }

    public Life(int posX, int posY) {
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
