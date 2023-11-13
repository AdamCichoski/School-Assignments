package animals;

import animals.Animal;
import common.Edible;

/**
 * This class will hold the methods to create a Chicken object
 * @author Adam Cichoski
 * Assignment06 Question 02
 */
public class Chicken extends Animal implements Edible{
    private double weight;
    public Chicken(String name, int age, double weight){
        super(name, age);
        this.weight = weight;
    }
    /**
     * Gets the weight of the chicken
     * @return weight
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Sets the weight of the chicken
     * @param weight new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * This method from the Animal class prints out the sound that the animal 
     * makes
     */
    @Override
    public void sound() {
        System.out.println("Cluck cluck");
    }

    @Override
    public String howToEat() {
        return ("Roast it, fry it, or try it in curry!");
    }
    /**
     * This method returns information about this chicken in the form of a string
     * @return a string of information 
     */
    @Override
    public String toString(){
        return "Chicken{"+super.toString()+", weight="+this.weight+"}";
    }
}
