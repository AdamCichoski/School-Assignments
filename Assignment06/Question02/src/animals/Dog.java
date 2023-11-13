package animals;

import animals.Animal;

/**
 * This class will hold the methods to create a Dog object
 * @author Adam Cichoski
 * Assignment06 Question 02
 */
public class Dog extends Animal{
    private String breed;
    
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }
    /**
     * Returns the breed of the dog
     * @return 
     */
    public String getBreed() {
        return breed;
    }
    /**
     * Sets the dog breed
     * @param breed new breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * This method returns information about this dog in the form of a string
     * @return a string of information
     */
    @Override
    public String toString(){
        return "Dog{"+ super.toString()+", breed="+this.breed+"}";
    }
    /**
     * This method from the Animal class prints out the sound an animal makes
     */
    @Override
    public void sound() {
        System.out.println("Bark Bark!!!"); 
    }
    
}
