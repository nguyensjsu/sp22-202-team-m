import greenfoot.*; 
import java.util.Random;
// TODO: Auto-generated Javadoc
/**
 * A factory for creating Obstacle objects.
 */
public class ObstacleFactory extends Factory 
{
    

    /** The random number. */
    Integer randomNumber = 0;
    
    /** The random generator. */
    Random randomGenerator;
    
    /**
     * Instantiates a new food factory.
     *
     * @param city the city
     */
    ObstacleFactory(){
       randomGenerator = new Random();
    }
    
    /**
     * Gets the item.
     *
     * @return the item
     */
    public Actor getItem() {

        randomNumber = randomGenerator.nextInt(10);
              
        switch(randomNumber % 2){
                case 0: return new Stone();
               default: return new Fire();
          }
        }

}
