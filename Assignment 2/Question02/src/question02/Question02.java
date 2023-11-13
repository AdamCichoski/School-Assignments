package question02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program will take an infinite amount of integers and store it inside of
 * an array, resizing the array in a private method after
 *
 * @author Adam Cichoski Assignment 2 Question 2
 */
public class Question02 {

    public static void main(String[] args) {
        System.out.println("Enter:");
        int[] finalArray = getInts();
        System.out.println(Arrays.toString(finalArray));
    }

    /**
     * This method will take in an infinite amount of integers and store them
     * into an array
     * @return the array that was creating to hold the information
     */
    public static int[] getInts() {
        Scanner input = new Scanner(System.in);        
        int[] array = new int[10];
        int count = 0;
        int value = input.nextInt();
        while (value != 0) { //This loop will run until the input is 0, and will fill the array with inputted values
            array[count] = value;
            count++; // The count is used both for the index of the array, as well as checking the current size
            if (count == array.length) {
                array = resizeArray(array, count * 2);      
            }
            value = input.nextInt();
        }
        return resizeArray(array, count); // This was used to size the array down before returning to the finalArray
    }
    /**
     * This method resizes the array by making a new array and transferring the data
     * @param array is an array of integers
     * @param newSize is the new size for the array
     * @return the resized array with the transferred data
     * This method is set to private so that the user doesn't have to see what 
     * is being done here. 
     */
    private static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        int loopDuration = newArray.length;
        if(newArray.length > array.length){ // This checks the smaller of the two lengths to determine how long the loop will run
            loopDuration = array.length;
        }
        for (int i = 0; i < loopDuration; i++) { //The loop duration had to be the shorter length to avoid out of bounds errors
            newArray[i] = array[i];
        }

        return newArray;
    }
}
