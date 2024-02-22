/*
 * Given an unsorted array of size N with distinct elements. Find the 2nd largest
 * element from the array in O(n) time complexity
 */
package PracticeQuestions;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // yaha par no. of elements aayega
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = a[0]; // largest element
        int y = a[0]; // 2nd largest element

        for(int i=1;i<n;i++){
            if(a[i]>x && a[i]>y){
                y = x;
                x = a[i];
            }
            else if(a[i]<x && a[i]>y){
                y = a[i];
            }
        }

        System.out.println(y);

        sc.close();
    }
}
