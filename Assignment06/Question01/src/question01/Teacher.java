package question01;

/**
 * This class will hold the methods to create a teacher
 * @author Adam Cichoski
 * Assignment06 Question03
 */
public class Teacher extends Person{
    protected String subject;
    protected double salary;
    Teacher(String name, int age, String subject, double salary){
        super(name,age);
        this.subject=subject;
        this.salary = salary;
    }
    /**
     * This method gets the teaching subject
     * @return subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     * This method sets the teaching subject
     * @param subject new subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * This method gets the teachers salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * This method sets the teachers salary
     * @param salary new salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**
     * This prints out the instance variables in a string
     * @return the info in a string
     */
    @Override
    public String toString(){
        return (super.name +" is "+ super.age +".\nTeaching subject: "+ this.subject +"\nSalary: "+ this.salary);
    }
}
