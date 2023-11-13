package question01;

/**
 * This program will create three different objects, Student, teacher and college
 * student, and will print out their values in a string
 * @author Adam Cichoski
 * Assignment06 Question01
 */
public class Question01 {
    public static void main(String[] args) {
        Person p = new Student("Dave", 21, "33849398", 4.0);
        System.out.println(p.toString()+"\n");
        
        Person p1 = new Teacher("Dave", 21, "CSC 340", 120000);
        System.out.println(p1.toString()+"\n");
        
        Student p2 = new CollegeStudent("Dave", 21, "33849398", 4.0, "Computer Science", 2);
        System.out.println(p2.toString());
    }
    
}
