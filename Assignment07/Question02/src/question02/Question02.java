package question02;

import java.util.Arrays;

/**
 * This program will create a generic selection sort algorithm
 *
 * @author Adam Cichoski Assignment07 Question02
 */
public class Question02 {

    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45), new Circle(20), new Circle(10)};
        System.out.println("Before selection sort: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        
        System.out.println("\nAfter: ");

        selectionSort(a1);
        selectionSort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }

    /**
     * Uses a selection sort approach for any type of array that extends
     * Comparable
     *
     * @param <T> is some generic type T that
     * @param t is the array of type T
     * @return is the sorted array of type T
     */
    public static <T extends Comparable<? super T>> T[] selectionSort(T[] t) {
        int marker = t.length - 1;
        while (marker > 0) {
            int maxIndex = 1;
            for (int i = 0; i <= marker; i++) {
                maxIndex = (t[i].compareTo(t[maxIndex]) > 0) ? i : maxIndex;
            }
            T temp = t[maxIndex];
            t[maxIndex] = t[marker];
            t[marker] = temp;
            marker--;
        }
        return t;
    }

}
