import java.util.Random;

import greenfoot.*;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Food objects.
 */
public class FoodFactory extends Factory {

    /** The random number. */
    Integer randomNumber = 0;
    
    /** The random generator. */
    Random randomGenerator;
    

 

    /**
     * Instantiates a new food factory.
     *
     * @param city the city
     */
    FoodFactory(){
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
                case 0: return new Apple();
                
               default: return new Banana();
                
             
          
          
          }

        
        
    }
}
