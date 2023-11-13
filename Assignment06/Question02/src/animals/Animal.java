package animals;

/**
 * This abstract class will hold the methods to give actions to different animals
 * @author Adam Cichoski
 * Assignment06 Question 02
 */
public abstract class Animal {
    protected String name;
    protected int age;
    protected Animal(String name, int age){
        this.name = name;
        this.age=age;
    }
    /**
     * This abstract method is meant to return the sound that an animal makes
     */
    protected abstract void sound();
    /**
     * Gets the name of the animal
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the animal
     * @param name is the new name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the age of the animal
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * Sets the age of the animal
     * @param age is the new age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * This method returns information about this animal in the form of a string
     * @return a string of information
     */
    @Override
    public String toString(){
        return "name="+ this.name+", age="+this.age;
    }
}
