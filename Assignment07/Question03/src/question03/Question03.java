package question03;

import java.util.Arrays;

/**
 * This program will create an insertion sort algorithm
 * @author Adam Cichoski
 * Assignment07 Question03
 */
public class Question03 {
    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45),new Circle(20), new Circle(10)};
        System.out.println("Before insertion sort: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println("\nAfter: ");
        
        insertionSort(a1);
        insertionSort(a2);
        
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
    /**
     * This method is the algorithm for a selection sort approach to sorting 
     * a generic array of type T, that extends comparable
     * @param <T> is a generic type that extends comparable
     * @param t is an array of type t
     * @return a sorted array of type t
     */
    public static <T extends Comparable<? super T>> T[] insertionSort(T[] t){
        for (int i=1;i<t.length;i++){
            T key = t[i];
            int j=i-1;
            while(j>=0 && t[j].compareTo(key)>0){
                t[j+1] = t[j];
                j--;
            }
            t[j+1]=key;
        }
        return t;
    }
}
