/**
 * The Class Level3 implements Level State to create a new level 3
 */
public class Level3 implements ILevelState {

    LevelState l;
    int speed;

    /**
     * Creates Level 3
     *
     * @param l
     */
    public Level3(LevelState l) {
        this.speed = 40;
        this.l = l;
    }

    /**
     * Change state.
     */
    @Override
    public void changeState() {
        l.changeToLevel4();

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



