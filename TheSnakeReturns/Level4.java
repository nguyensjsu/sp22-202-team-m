import greenfoot.*;

/**
 * The Class Level4 implements Level State to create a new level 4
 */
public class Level4 implements ILevelState {

    LevelState l;
    int speed;

    /**
     * Creates Level 4
     *
     * @param l
     */
    public Level4(LevelState l) {
        
        this.speed = 40;
        this.l = l;
    }

    /**
     * Change state.
     */
    @Override
    public void changeState() {
        l.changeToLevel5();
        
    }

    /**
     * Gets the current speed.
     *
     * @return the level speed
     */
    public int getSpeed(){
        return speed;
    }
}



