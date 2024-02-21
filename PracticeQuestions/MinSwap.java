/*
 * Given an array of N distinct elements, find the minimum number of swaps
 * required to sort the array.
 */
package PracticeQuestions;
import java.util.*;

public class MinSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // yaha par no. of elements aayega
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int swap =0;
        for(int i=0;i<n-1;i++){
            int temp=i;
            for(int j=i+1;j<n;j++){
                if(a[temp]<a[j]){
                    temp = j;
                }
            }
            if(temp!=i){
                int t = a[temp];
                a[temp] = a[i];
                a[i] = t;
                swap=swap+1;
            }
        }
        System.out.println(swap);
        sc.close();
    }
}
