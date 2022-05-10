/**
 * Write a description of class Factory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import greenfoot.Actor;

public abstract class Factory {

    /**
     * Gets the item.
     *
     * @return the item
     */
    public abstract Actor getItem();

    /**
     * Send item.
     *
     * @return the actor
     */
    public Actor sendItem() {
        return getItem();
    }
}
