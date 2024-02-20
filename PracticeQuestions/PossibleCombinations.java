/*
 * Print all possible combinations of r elements in a given array of size n
 */
package PracticeQuestions;
import java.util.*;

public class PossibleCombinations {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // yaha par no. of elements aayega
        int []arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); // yaha par elements aayenge
        }
        // int size = sc.nextInt(); // yaha par size of the combination aayega

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }

        sc.close();
    }
}
