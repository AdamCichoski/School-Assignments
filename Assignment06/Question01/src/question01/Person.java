package question01;

/**
 * This class will hold the methods to create a person 
 * @author Adam Cichoski
 * Assignment06 Question03
 */
public class Person {
    protected String name;
    protected int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    /**
     * This gets the name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * This sets the name variable
     * @param name is the inputted name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This gets the age
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * This sets the person's age
     * @param age new age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * This prints out the instance variables in a string
     * @return the info in a string
     */
    @Override
    public String toString(){
        return (this.name+" is "+ this.age+" years old");
        
    }
    
}
