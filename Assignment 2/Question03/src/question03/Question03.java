package question03;

/**
 * This program will take a boolean array filled with all true elements, with
 * the exception of indices 0 and 1, and will turn all non-prime number indices
 * to false
 *
 * @author Adam Cichoski Assignment 2 Question 3
 */
public class Question03 {

    public static void main(String[] args) {
        boolean[] boolArray = new boolean[1000];
        fillArray(boolArray);
        primeNumbers(boolArray);
        print(boolArray);
    }
    /**
     * This method fills a boolean array with all true values
     * @param array is an array of booleans
     */
    public static void fillArray(boolean[] array){
        for(int i=2; i<array.length;i++){
            array[i]=true;
        }
    }
    /**
     * This method checks for when an index is not a prime number, and sets it to false
     * @param array is a boolean array filled with only false values
     */
    public static void primeNumbers(boolean[] array) {
        for (int i = 2; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++){//j starts at i+1 so that index i does not get set to false
                if((j/(i*1.0))%1==0){
                    array[j]=false;
                }
            }
        }
    }
    /**
     * This method prints out only the true elements in a boolean array, as well as their index
     * @param array is an array of booleans with prime indices set to true
     */
    public static void print(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                System.out.printf("%-6d", i);
                count++;
                if (count % 15 == 0) {
                    System.out.println("");
                }
            }

        }
    }
}
