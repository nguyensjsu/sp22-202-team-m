
/**
 * The Class Level1.
 */
public class Level1 implements ILevelState {

    LevelState l;
    int speed;

    /**
     * Instantiates a new level 1.
     *
     * @param l the l
     */
    public Level1(LevelState l) {

        this.speed = 30;
        this.l = l;
    }

    /**
     * Change state.
     */
    @Override
    public void changeState() {

        l.changeToLevel2();
    }

    /**
     * Gets the current speed.
     *
     * @return the level speed
     */
    public int getSpeed() {
        return speed;
    }

}

