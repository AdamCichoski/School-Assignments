package fruits;
/**
 * This class will hold the methods to make an orange fruit object
 * @author Adam Cichoski
 * Assignment06 Question02
 */
public class Orange extends Fruit{
    String taste;
    public Orange(boolean riped, String taste){
        super(riped);
        this.taste = taste;
    }
    /**
     * Gets the taste of an orange
     * @return taste
     */
    public String getTaste() {
        return taste;
    }
    /**
     * Sets the taste of an orange
     * @param taste is the new taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }
    /**
     * This method returns information about this Orange in the form of a string
     * @return a string of information 
     */
    @Override
    public String toString(){
        return "Orange{"+super.toString()+", taste="+this.taste+"}";
    }
    /**
     * This method from the Edible interface returns a string about how to 
     * eat something that is edible
     */
    @Override
    public String howToEat(){
        return "Make sure to peel it before eating it!";
    }
}
