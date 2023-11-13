package question03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program will create an ArrayList of Circle objects and will use the
 * contains method to see if the ArrayList contains
 * @author Adam Cichoski 
 * Assignment06 Question03
 */
public class Question03 {
    public static void main(String[] args) {
        ArrayList<Circle> circs = new ArrayList();
        circs.add(new Circle(5));
        circs.add(new Circle(6));
        circs.add(new Circle(7));
        circs.add(new Circle(8));
        circs.add(new Circle(9));
        
        //Checking to see if ArrayList has circles with radius 5-14
        for (int i = 5; i < 15; i++) {
            System.out.printf("%3d %-5b\n", i, circs.contains(new Circle(i)));
        }
    }
}
