/**
 * Write a description of class IScoreSubject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IScoreSubject {

    /**
     * attach observer.
     *
     * @param observer the observer
     */
    public void attachObserver(IScoreObserver observer);

    /**
     * Remove Observer
     *
     * @param obj Pin AUth Observer to Remove
     */
    void removeObserver(IScoreObserver obj);

    /**
     * Notify observer.
     */
    public void notifyLevelState();
}
