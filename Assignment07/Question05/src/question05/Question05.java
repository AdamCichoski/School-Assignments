package question05;

import java.util.Arrays;

/**
 * This program will create a quick sort algorithm
 *
 * @author Adam Cichoski Assignment07 Question05
 */
public class Question05 {

    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45), new Circle(20), new Circle(10)};
        System.out.println("Before quick sort: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        quickSort(a1, 0, a1.length-1);
        quickSort(a2, 0, a2.length-1);
        System.out.println("\nAfter: ");

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
    /**
     * This method splits up the array to be partitioned and sorted in the process
     * @param <T> is some generic subtype of Comparable
     * @param t is an array of the generic
     * @param p is the index of the pivot
     * @param r is the highest index in the given range of the array
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] t, int p, int r){
        if(p<r){
            int x = (int)((Math.random() * (r-p)+1)+p); //I set my range like this to avoid out of bounds errors
            swap(t, x, r);
            int q = partition(t, p, r);
            quickSort(t, p, q-1);
            quickSort(t, q+1, r);
        }
    }
    /**
     * This method moves the elements in an array that are less than the index r
     * to the left and the elements that are larger than r to the right of element r
     * @param <T> is a generic subtype of Comparable
     * @param t is an array of the generic 
     * @param p is the index of the pivot
     * @param r is the highest index in the given range of the array
     * @return the partitioned array
     */
    public static <T extends Comparable<? super T>> int partition(T[] t, int p, int r) {
        T x = t[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (t[j].compareTo(x) <= 0) {
                swap(t,++i,j);
            }
        }
        swap(t, ++i, r);
        return i;
    }
    /**
     * This method swaps the values in two indices of some generic array type
     * @param <T> is a generic array type
     * @param t is an array of a generic array
     * @param a is the first index in the array
     * @param b is the second index in the array
     */
    private static <T> void swap(T[] t, int a, int b){
        if(a>= t.length){
            throw new IllegalArgumentException("WTF is going onnnn!!! a = "+ a+" and length is "+ t.length);
        }
        T c = t[a];
        t[a] = t[b];
        t[b] = c;
    }
}
