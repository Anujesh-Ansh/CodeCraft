/*
 * Index of an element
 * Find index of an element in a sorted array in O(logn) time and print "-1" if it is not present

 * Input
 * 6 3 5 7 9 10 90 10

 * Output
 * 4
 */

package PracticeQuestions;
import java.util.Scanner;

public class LogN {
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();

        int l = 0;
        int r = n-1;
        int indec =-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid]==x){
                indec = mid;
                break;
            }else if(a[mid]<x){
                l=mid+1;
            }
            else if(a[mid]>x){
                r=mid-1;
            }else{
                indec=-1;
            }
        }
        System.out.println(indec);
        sc.close();
	}

}
