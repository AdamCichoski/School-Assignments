package question01;

/**
 * This program will create an instance of the Cat class, created within this package,
 * and will initialize it and test its methods. 
 * @author Adam Cichoski
 * Assignment 3 Question 1
 */
public class Question01 {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", Color.BLACK, "October 8, 2003", 19, false);
        tom.setName("Jerry");
        System.out.println(tom.getName());
        tom.setDob("August 14, 2003");
        System.out.println(tom.getDob());
        tom.setColor(Color.GREEN);
        System.out.println(tom.getColor());
        tom.setStatus(true);
        System.out.println(tom.getStatus());
        try{
            tom.setDistance(15); //I threw the try and catch so that the program would continue
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Distance is "+ tom.getDistance());
    }
    
}
