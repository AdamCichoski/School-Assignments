package fruits;

/**
 * This class will hold the methods to make an apple fruit object
 * @author Adam Cichoski
 * Assignment06 Question02
 */
public class Apple extends Fruit{
    String color;
    public Apple(boolean riped, String color){
        super(riped);
        this.color = color;
    }
    /**
     * Gets the color of the apple
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * Sets the color of the apple
     * @param color new color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * This method returns information about this apple in the form of a string
     * @return a string of information 
     */
    @Override
    public String toString(){
        return "Apple{"+super.toString()+", color="+this.color+"}";
    }
    /**
     * This method from the Edible interface returns a string about how to 
     * eat something that is edible
     */
    @Override
    public String howToEat(){
        return "You can eat it raw!";
    }
}
