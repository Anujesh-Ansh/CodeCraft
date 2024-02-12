package Algorithms;

import java.util.Scanner;

public class RotatedCircularSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter the no of Elements of the Sorted Array:- ");
        n = sc.nextInt();


        int []a = new int[n];
        System.out.print("\nEnter the Elements:- ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int i=n-1;
        int counter = 0;
        while(a[i]<a[0]){
            counter = counter + 1;
            i--;
        }
        if(a[0]<a[n-1]){
            counter = 0;
        }

        int l=0;
        int r=n-1;
        int mid,next,prev;

        while(l<r){
            if(a[l]<=a[r]){
                counter =0;
            }
            mid = (l+r)/2;
            next = (mid+1)%n;
            prev = (mid-1+n)%n;
            if(a[mid]<=a[next] && a[mid]<=a[prev]){
                counter = mid;
            }
            else if(a[mid]<=a[r]){
                r = mid-1;
            }
            else if(a[mid]>=a[l]){
                l = mid+1;
            }
        }

        System.out.println("\nThe array is rotated "+(counter)+" times");

        sc.close();
    }
}


// 2 3 4 5 1

// 5 1 2 3 4

// 4
// 3
// 2
// 1
// 5

// 3 4 5 1 2

// 2
// 1


/*
3 4 5 2
0 1 2 3 4 5

if mid<mid+1
mid=r-mid

else
mid=mid-l

mid>mid+1 && mid>mid-1
counter = mid +1



 */