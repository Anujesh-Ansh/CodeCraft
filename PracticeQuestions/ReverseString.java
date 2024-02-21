/*
 * You are given a sentence as a string. You are required to reverse the words of
 * that sentence alternatively starting from the first word.
 */

package PracticeQuestions;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input daalo idhar
        String[] arr = s.split(" ");
        int x = arr.length;
        for(int i=0;i<x;i++){
            int a = arr[i].length();
            for(int j=a-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
    
}
