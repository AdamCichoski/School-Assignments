package question04;

import java.util.Arrays;

/**
 * This program will create a generic merge sort algorithm
 * @author Adam Cichoski 
 * Assignment07 Question04
 */
public class Question04 {
    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45), new Circle(20), new Circle(10)};
        System.out.println("Before merge sort: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        
        Object[] o = mergeSort(a1);
        System.out.println();
        Object[] o1 = mergeSort(a2);
        
        System.out.println("\nAfter: ");
        System.out.println(Arrays.toString(o));
        System.out.println(Arrays.toString(o1));
    }
    /**
     * Splits the array in half repeatedly, and calls on the merge method to 
     * combine sorted segments of the array
     * 
     * @param <T> is some generic class type that is a subtype of Comparable
     * @param t is an array of type T
     * @return the combined and sorted array
     */
    public static <T extends Comparable<? super T>> T[] mergeSort(T[] t) {
        if (t.length == 1) {
            return t;
        }
        int middle = t.length / 2;
        T[] left = Arrays.copyOfRange(t, 0, middle);
        T[] right = Arrays.copyOfRange(t, middle, t.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    /**
     * This method is an algorithm for a merge sort
     *
     * @param <T> a generic type that is some subtype of Comparable
     * @param a the left half of the array which is already sorted
     * @param b is the right half of the array which is already sorted
     * @return the combined and sorted array
     */
    public static <T extends Comparable<? super T>> T[] merge(T[] a, T[] b) {
        T[] c = (T[]) new Comparable[a.length+ b.length];
        int ma = 0, mb = 0, mc = 0;
        while (ma < a.length && mb < b.length ) {
            if (a[ma].compareTo(b[mb])<0){
                c[mc]=a[ma];
                ma++;
            }else{
                c[mc]=b[mb];
                mb++;
            }
            mc++;
        }
        while (ma<a.length){
            c[mc]=a[ma];
            ma++;
            mc++;
        }
        while(mb<b.length){
            c[mc] = b[mb];
            mb++;
            mc++;
        }
        return c;
    }
}
