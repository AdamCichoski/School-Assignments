package question01;

/**
 * This class will hold the methods and variables to create a student
 * @author Adam Cichoski
 * Assignment06 Question03
 */
public class Student extends Person{
    protected String id;
    protected double gpa;
    
    Student(String name, int age, String id, double gpa){
        super(name, age);
        this.id = id;
        this.gpa = gpa;
    }
    /**
     * This gets the student id
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * This sets the student id 
     * @param id is the inputted id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * This gets the students gpa
     * @return gpa
     */
    public double getGpa() {
        return gpa;
    }
    /**
     * This sets the students gpa
     * @param gpa inputted gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    /**
     * This prints out the instance variables in a string
     * @return the info in a string
     */
    @Override
    public String toString(){
        return (super.name +" is "+ super.age +".\nID: "+ this.id +"\nGPA: "+ this.gpa);
    }
}
