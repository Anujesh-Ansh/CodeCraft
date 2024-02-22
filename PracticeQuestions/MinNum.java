/*
 * Given N number of elements, write a program to find the minimum number of swaps 
 * required so that the maximum element is at the beginning and the 
 * minimum element is at last with the condition that only swapping of 
 * adjacent elements is allowed
 */

package PracticeQuestions;
import java.util.*;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max = -1;
        int min = a[0];
        int l,r;
        l=r=0;

        for(int i =0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                l=i;
            }
            if(a[i]<=min){
                min=a[i];
                r=i;
            }
        }

        if(l<r){
            System.out.println(l+n-r-1);
        }else{
            System.out.println(l-n-2-r);
        }

        sc.close();
    }
    
}
