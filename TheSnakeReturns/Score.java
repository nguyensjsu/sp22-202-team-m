import greenfoot.*;

/**
 * The Class Score is an Actor and implements ScoreObserver, when score changes, level state machine is notified and level is updated.
 * Also used to update text displayed for score and level.
 */
public class Score extends Actor implements IScoreSubject, ILevelObserver{

    private int score;
    private int level;
    
    private IScoreObserver observer;

    /**
     * Set score and level text.
     */
    public void setText() {
        // top-level image
        GreenfootImage image = new GreenfootImage(400, 200);
        // level sign
        GreenfootImage textLevel = new GreenfootImage(Integer.toString(level), 24, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage levelSignImage = new GreenfootImage("display/level_sign.png");
        levelSignImage.scale(80,80);        
        levelSignImage.drawImage(textLevel, 35, 40);
        // score sign
        GreenfootImage textScore = new GreenfootImage(Integer.toString(score), 24, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage scoreSignImage = new GreenfootImage("display/score_sign.png");
        scoreSignImage.scale(80,80);
        scoreSignImage.drawImage(textScore, (score > 9)? 32 : 35, 36);        
        // add both signs to top-level image
        image.drawImage(scoreSignImage, 200, 100);
        image.drawImage(levelSignImage, 280, 100);        
        setImage(image);
    }

    /**
     * Instantiates a new updated text display.
     */
    public Score() {
        this.score = 0;
        this.level = 1;
        setText();
    }

    /**
     * returns updated score value
     */
    public int getScore() {
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

        setText();

        if (score % 5 == 0) {
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
    public void removeObserver(IScoreObserver obj) {
        this.observer = null;
    }

    /**
     * Notify Level State.
     * notifies observers of current score to change level state
     */
    @Override
    public void notifyLevelState() {
        if (this.observer != null) {
            this.observer.changeState(score);
        }
    }
    
    @Override
    public void update(int speed, int level) {
        this.level = level;
        setText();
    }
}
