package question01;
/**
 * This program will find the length of a string using a recursive method
 * @author Adam Cichoski
 * Assignment05 Question01
 */
public class Question01 {
    public static void main(String[] args) {
        String[] str = {"","b", "ba","bac","baco","bacon", "baconator"};
        int index = 0;
        
        for (int i=0;i<str.length;i++){
            System.out.println(findLength(str[i]));
        }
    }
    /**
     * This method recursively finds the length of a string
     * @param s is a string that will be checked
     * @return the length of the string
     */
    public static int findLength(String str){
        if (str.equals("")){
            return 0; //This is an easy out, but also ends the recursion 
        }
        return findLength(str.substring(1))+1;//Recusion ends by returning zero, so I add 1 for each character that was chopped off from substring
    }  
}
