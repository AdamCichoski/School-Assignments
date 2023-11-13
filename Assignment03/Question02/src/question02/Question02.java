package question02;
/**
 * This program will find the second highest value in an integer array
 * @author Adam Cichoski
 * Assignment 3 Question 2
 */
public class Question02 {
    public static void main(String[] args) {
    int[] a1 = {1};
        int[] a2 = {1, 1};
        int[] a3 = {1, 1, 1, 1, 1};
        int[] a4 = {2, 1};
        int[] a5 = {3, 2, 1};
        int[] a6 = {1, 2, 3};
        int[] a7 = {-100,0,-200,200,100,50,7,-1};
        
        /*
        * Throws an IllegalArgumentException because size of array is too small
        */
        try{
            System.out.println("The second highest value is " + secondMax(a1));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        /*
        * Throws an IllegalArgumentException because all elements are the same
        */
        try{
            System.out.println("The second highest value is " + secondMax(a2));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        /*
        * Throws an IllegalArgumentException because all elements are the same
        */
        try{
            System.out.println("The second highest value is " + secondMax(a3));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("The second highest value is " + secondMax(a4));
        System.out.println("The second highest value is " + secondMax(a5));
        System.out.println("The second highest value is " + secondMax(a6));
        System.out.println("The second highest value is " + secondMax(a7));
    }

    /**
     * This method finds the second highest value in an array
     * @param array is an array of integers
     * @return the second highest value
     * IllegalArgumentException if the size of the array is less than 2 elements
     * IllegalArgumentException if all elements are the same
     */
    public static int secondMax(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("No second max for array size less than 2!");
        }
        int max = array[0], second =array[0];
        for(int i=0, j=array.length-1; i<array.length;i++,j--){
            if(array[i] > max || i==0){ 
                second = max; //I did this to set the second variable to the previous max value
                max = array[i];
                continue;
            }
            //Checking if second == max is used since second and max are initalized to the same value. 
            second = (array[i]>second || second == max)? array[i]:second;
        }
        if(second == max){
            throw new IllegalArgumentException("The array has one element. No second maximum!");
        }
        
        return second;
    }
    
}
