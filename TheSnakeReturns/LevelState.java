import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class LevelState here.
 */
public class LevelState implements IScoreObserver, ILevelSubject {

    ILevelState level1;
    ILevelState level2;
    ILevelState level3;
    ILevelState level4;
    ILevelState level5;
    ILevelState current;

    public int speed;
    public int level;

    List<ILevelObserver> observers;

    /**
     * Instantiates a new level state machine.
     */
    public LevelState() {

        level1 = new Level1(this);
        level2 = new Level2(this);
        level3 = new Level3(this);
        level4 = new Level4(this);
        level5 = new Level5(this);
        observers = new ArrayList<>();
    }

    /**
     * Change current state -> observes score.
     *
     * @param score
     */
    @Override
    public void changeState(int score) {
        current.changeState();
    }

    /**
     * Gets the state name
     *
     * @return state name
     */
    public String getState() {
        //return current.getClass().getName();
        return Integer.toString(level);
    }


    /**
     * Change to level 1.
     */
    public void changeToLevel1() {
        this.current = level1;
        this.level = 1;
        notifyObservers();
    }

    /**
     * Change to level 2.
     */
    public void changeToLevel2() {
        this.current = level2;
        this.level = 2;
        notifyObservers();

    }

    /**
     * Change to level 3.
     */
    public void changeToLevel3() {
        this.current = level3;
        this.level = 3;
        notifyObservers();

    }

    /**
     * Change to level 4.
     */
    public void changeToLevel4() {
        this.current = level4;
        this.level = 4;
        notifyObservers();

    }

    /**
     * Change to level 5.
     */
    public void changeToLevel5() {
        this.current = level5;
        this.level = 5;
        notifyObservers();

    }

    /**
     * End game.
     */
    public void endGame() {
        //do nothing infinite - taking care of end game in world

    }

    /**
     * Attach Observer.
     *
     * @param ob the ob
     */
    public void attach(ILevelObserver ob) {
        observers.add(ob);
    }


    /**
     * Remove Observer.
     *
     * @param ob
     */
    public void detach(ILevelObserver ob) {
        observers.add(ob);
    }

    /**
     * Notify observers.
     *
     * @param speed
     * @parem level
     */
    public void notifyObservers() {
        for (ILevelObserver ob : observers) {
            ob.update(current.getSpeed(), level);
        }
    }

}

