/**
 * The Class Level5 implements Level State to create a new level 5
 */
public class Level5 implements ILevelState {

    LevelState l;
    int speed;

    /**
     * Creates Level 5
     *
     * @param l
     */
    public Level5(LevelState l) {

        this.speed = 50;
        this.l = l;
    }

    /**
     * Change state.
     */
    @Override
    public void changeState() {
        l.endGame();

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



