/**
 * The Class Level2 implements Level State to create a new level 2
 */
public class Level2 implements ILevelState {

    LevelState l;
    int speed;

    /**
     * Creates Level 2
     *
     * @param l
     */
    public Level2(LevelState l) {

        this.speed = 35;
        this.l = l;
    }

    /**
     * Change state.
     */
    @Override
    public void changeState() {
        l.changeToLevel3();
        //l.endGame();
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


