package question01;

import java.util.Arrays;

/**
 * This program will perform a bubble sort on different containers
 *
 * @author Adam Cichoski 
 * Assignment07 Question01
 */
public class Question01 {

    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45),new Circle(20), new Circle(10)};
        System.out.println("Before bubble sort: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println("\nAfter: ");
        
        bubbleSort(a1);
        bubbleSort(a2);
        
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
    /**
     * This method creates a generic bubble sort for any class type that extends comparable
     * @param <T> is a generic type
     * @param t is an instance of some generic type 
     * @return the sorted array
     */
    public static <T extends Comparable<? super T>> T[] bubbleSort(T[] t){
        boolean swapped = true;
        int last = t.length;
        while(swapped){
            swapped = false;
            for(int i=1;i<last;i++){
                if(t[i-1].compareTo(t[i])>0){
                    T temp = t[i-1];
                    t[i-1]=t[i];
                    t[i]=temp;
                    swapped = true;
                }
            }
        }
        return t;
    }
}
