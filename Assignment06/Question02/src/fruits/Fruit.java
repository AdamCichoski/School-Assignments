package fruits;

import common.Edible;

/**
 * This class will hold the methods to create a fruit object
 * @author Adam Cichoski
 * Assignment06 Question02
 */
public abstract class Fruit implements Edible{
    protected boolean riped;
    protected Fruit(boolean riped){
        this.riped = riped;
    }
    /**
     * Gets status of fruits ripeness
     * @return ripeness
     */
    public boolean isRiped() {
        return riped;
    }
    /**
     * Sets the status of fruits ripeness
     * @param riped new ripeness
     */
    public void setRiped(boolean riped) {
        this.riped = riped;
    }
    /**
     * This method returns information about this fruit in the form of a string
     * @return a string of information 
     */
    @Override
    public String toString(){
        return "riped="+this.riped;
    }
}
