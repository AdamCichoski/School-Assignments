package question01;

/**
 * This class will hold the methods to create a college student
 * @author Adam Cichoski
 * Assignment06 Question03
 */
public class CollegeStudent extends Student {
    protected String major;
    protected int year;
    CollegeStudent(String name, int age, String id, double gpa, String major, int year){
        super(name, age, id, gpa);
        this.major=major;
        this.year=year;
    }
    /**
     * This method gets the students major
     * @return major
     */
    public String getMajor() {
        return major;
    }
    /**
     * This method sets the students major
     * @param major new major
     */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
     * This gets the students school year (freshmen, sophomore, etc.)
     * @return year
     */
    public int getYear() {
        return year;
    }
    /**
     * Sets the students school year
     * @param year new year
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * This prints out the instance variables in a string
     * @return the info in a string
     */
    @Override
    public String toString(){
        return (super.name +" is "+ super.age +".\nID: "+ super.id
                +"\nGPA: "+ super.gpa + "\nMajor: " +this.major 
                +"\nYear: "+ this.year);
    }
}
