
/**
 * Write a description of class ILevelSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ILevelSubject  
{
     
     /**
      * Attach observer
      */
     public void attach(ILevelObserver ob);
     
     /**
      * remove observer
      *
      */
     public void detach(ILevelObserver ob);
     
     /**
      * Notify observers.
      * @param speed the speed
      */
     public void notifyObservers(int speed);
}

