package question01;

import java.util.Arrays;

/**
 *This program will take the pseudo code from the slides and convert in into a program
 * @author Adam Cichoski
 * Assignment 2 Question 1
 */
public class Question01 {
    public static void main(String[] args) {
     int [] array = {10,9,8,7,6,5,4,3,2,1};
     System.out.println(Arrays.toString(array));
     sortArray(array);
     System.out.println("\n        Sorted:");
     System.out.println(Arrays.toString(array));
    }
    /**
     * This method sorts the array one by one, looking back through each already sorted element in the array to be sure it
     * stays sorted
     * @param array is an array of integers
     */
    public static void sortArray(int[] array){
        for(int j=1;j<array.length;j++){
            int key = array[j];
            int i=j-1;
            while(i>=0 && array[i]>key){ // I set it to i>=0 because the first index is zero, as opposed to being one in the pseudocode
                int temp=array[i+1];
                array[i+1]= array[i];
                array[i]=temp;
                i--;
                key=array[i+1];
            }
        }
    }
}
