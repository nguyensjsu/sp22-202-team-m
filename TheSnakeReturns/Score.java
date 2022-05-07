import greenfoot.*;

/**
 * The Class Score is an Actor and implements ScoreObserver, when score changes, level state machine is notified and level is updated.
 * Also used to update text displayed for score and level.
 */
public class Score extends Actor implements IScoreSubject {

    private int score = 0;
    private IScoreObserver observer;
    private String level = "Level : 1";

    /**
     * Set score and level text.
     */
    public void setText() {
        String text = "Score: " + score + " " + level;
        GreenfootImage textImage = new GreenfootImage(text, 20, Color.GREEN, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(1600, 60);
        image.drawImage(textImage, 750, 16);
        setImage(image);
    }

    /**
     * Instantiates a new updated text display.
     */
    public Score() {
        setText();
    }

    /**
     * returns updated score value
     */
    public int getScore(){
        return score;
    }

    /**
     * Act.
     */
    public void act() {

    }

    /**
     * Updates score then sets text to display
     *
     * @param level ->level class name
     */
    public void updateScore(String level) {
        score++;

        StringBuilder temp = new StringBuilder(level);
        temp.insert(temp.length()-1, " : ");
        temp.append(" ");
        this.level = temp.toString();


        setText();

        if (score%5==0) {
            notifyLevelState();
        }
    }

    /**
     * attach observer.
     *
     * @param obj -> attached observers
     */
    @Override
    public void attachObserver(IScoreObserver obj) {
        this.observer = obj;

    }

    /**
     * remove observer.
     *
     * @param obj
     */
    public void removeObserver( IScoreObserver obj ){
        this.observer = null;
    }

    /**
     * Notify Level State.
     * notifies observers of current score to change level state
     */
    @Override
    public void notifyLevelState() {
        if(this.observer != null){
            this.observer.changeState(score);
        }
    }
}
