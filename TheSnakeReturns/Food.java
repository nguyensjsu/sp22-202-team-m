import greenfoot.Actor;
import greenfoot.GreenfootImage;


public class Food extends Actor {

    /**
     * Constructor Food
     * Sets the image for the food class
     */
    public Food(String name) {
        GreenfootImage image = new GreenfootImage(name);
        image.scale(40, 40);
        setImage(image);
    }
}
