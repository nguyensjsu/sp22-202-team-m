/**
 * Write a description of class IScoreSubject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface ILifeSubject
{

    /**
     * attach observer.
     *
     * @param observer the observer
     */
    public void attachObserver(ILifeObserver observer);

    /**
     * Remove Observer
     * @param obj Pin AUth Observer to Remove
     */
    void removeObserver( ILifeObserver obj ) ;

    /**
     * Notify observer.
     */
    public void notifyLifeObserver();

}
