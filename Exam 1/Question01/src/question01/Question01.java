package question01;

/**
 * This program will find the maximum difference between two elements in an integer array
 * @author Adam Cichoski
 * Exam 1 Question 1
 */
public class Question01 {
    public static void main(String[] args) {
        int[] a1 = {1};
        int[] a2 = {1,1};
        int[] a3 = {3,1,4,1,5,9,2};
        int[] a4 = {-1,-2,-3,-4,-5,-7};
        int[] a5 = {9,4,6,8,2,2};
        int[] a6 = {10,9,8,7,6,4,2,-1};
        int[] a7 = {0,100,1000,10000,-10};
        int[] a8 = {1,2,3,0,1,10};
        try{
            System.out.println(maxDifference(a1));
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println(maxDifference(a2));
        System.out.println(maxDifference(a3));
        System.out.println(maxDifference(a4));
        System.out.println(maxDifference(a5));
        System.out.println(maxDifference(a6));
        System.out.println(maxDifference(a7));
        System.out.println(maxDifference(a8)); 
    }
    /**
     * This method calculates the largest difference in the array from left to right
     * @param array is an array of integers
     * @return the largest difference in the array
     * IllegalArgumentException when there are less than 2 elements in the array
     * The run time of this method is O(n), because the loop runs n times
     */
    public static int maxDifference(int[] array){
        if(array.length<2){
            throw new IllegalArgumentException("Array size too small. No difference of only one element!");
        }
        int diff=0, min =array[0];   
        for(int i=1;i<array.length;i++){
            if(array[i]-min > diff || i==1){//i==1 is also there so I can set the diff to a usable value for this for loop
                diff=array[i]-min;
                if(array[i-1]<min){ //This updates the minimum value to the new smallest element
                    min=array[i-1]; 
                    diff=array[i]-min;//if statement determined that a[i] is bigger than before, so I can now update my difference
                    continue;
                }
            }
            min=(array[i-1]<min)? array[i-1]: min;//This was done to ensure that we update the minimum to the smallest value so far
        }
        return diff ;
    }
}
