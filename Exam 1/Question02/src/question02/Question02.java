package question02;

import java.util.Arrays;

/**
 * This program will take an array input to determine if only one element needs
 * to be removed in order to be a strictly increasing array
 *
 * @author Adam Cichoski Exam 1 Question 2
 */
public class Question02 {

    public static void main(String[] args) {
        int[] a1 = {1, 3, 2, 1}; // false
        int[] a2 = {1, 3, 2}; // true
        int[] a3 = {1, 2, 1, 2}; // false
        int[] a4 = {3, 6, 5, 8, 10, 20, 15}; // false
        int[] a5 = {1, 1, 2, 3, 4, 4}; // false
        int[] a6 = {1, 4, 10, 4, 2}; // false
        int[] a7 = {10, 1, 2, 3, 4, 5}; // true
        int[] a8 = {1, 1, 1, 2, 3}; // false
        int[] a9 = {0, -2, 5, 6}; // true
        int[] a10 = {1, 2, 3, 4, 5, 3, 5, 6}; // false
        int[] a11 = {40, 50, 60, 10, 20, 30}; // false
        int[] a12 = {1, 1}; // true
        int[] a13 = {1, 2, 5, 3, 5}; // true
        int[] a14 = {1, 2, 5, 5, 5}; // false
        int[] a15 = {10, 1, 2, 3, 4, 5, 6, 1}; // false
        int[] a16 = {1, 2, 3, 4, 3, 6}; // true
        int[] a17 = {1, 2, 3, 4, 99, 5, 6}; // true
        int[] a18 = {123, -17, -5, 1, 2, 3, 12, 43, 45}; // true
        int[] a19 = {3, 5, 67, 98, 3}; // true
        int[] a20 = {1, 1, 1};// false
        
        // This formatting prints out whether my answer is correct or not. If true, then it is right
        System.out.println(Arrays.toString(a1) + ": "
                + (almostIncreasingSequence(a1) == false));
        System.out.println(Arrays.toString(a2) + ": "
                + (almostIncreasingSequence(a2) == true));
        System.out.println(Arrays.toString(a3) + ": "
                + (almostIncreasingSequence(a3) == false));
        System.out.println(Arrays.toString(a4) + ": "
                + (almostIncreasingSequence(a4) == false));
        System.out.println(Arrays.toString(a5) + ": "
                + (almostIncreasingSequence(a5) == false));
        System.out.println(Arrays.toString(a6) + ": "
                + (almostIncreasingSequence(a6) == false));
        System.out.println(Arrays.toString(a7) + ": "
                + (almostIncreasingSequence(a7) == true));
        System.out.println(Arrays.toString(a8) + ": "
                + (almostIncreasingSequence(a8) == false));
        System.out.println(Arrays.toString(a9) + ": "
                + (almostIncreasingSequence(a9) == true));
        System.out.println(Arrays.toString(a10) + ": "
                + (almostIncreasingSequence(a10) == false));
        System.out.println(Arrays.toString(a11) + ": "
                + (almostIncreasingSequence(a11) == false));
        System.out.println(Arrays.toString(a12) + ": "
                + (almostIncreasingSequence(a12) == true));
        System.out.println(Arrays.toString(a13) + ": "
                + (almostIncreasingSequence(a13) == true));
        System.out.println(Arrays.toString(a14) + ": "
                + (almostIncreasingSequence(a14) == false));
        System.out.println(Arrays.toString(a15) + ": "
                + (almostIncreasingSequence(a15) == false));
        System.out.println(Arrays.toString(a16) + ": "
                + (almostIncreasingSequence(a16) == true));
        System.out.println(Arrays.toString(a17) + ": "
                + (almostIncreasingSequence(a17) == true));
        System.out.println(Arrays.toString(a18) + ": "
                + (almostIncreasingSequence(a18) == true));
        System.out.println(Arrays.toString(a19) + ": "
                + (almostIncreasingSequence(a19) == true));
        System.out.println(Arrays.toString(a20) + ": "
                + (almostIncreasingSequence(a20) == false));
    }
    /**
     * This method checks to see if only one element needs to be removed for the array
     * @param array is an array of integers
     * @return a boolean determining if it is almost increasing 
     */
    public static boolean almostIncreasingSequence(int[] array) {
        int count = 0, previous=array[0];
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]>array[i]){
                previous=array[i];
                continue;
            }
            count++;
            if(count>1){
                return false;
            }
            previous = (array[i+1]>previous|| i==0)? array[i+1]:array[i];//This was done to determine if it was element i or i+1 that was out of place
            array[i+1]= previous; // This was done because if element at i+1 was out of place, I needed to test next rendition using element at i
            
        }
        return true;
    }
}
