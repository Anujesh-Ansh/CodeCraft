/*
 * Write a function called lucky_sevens which takes an array of integers and
 * returns true if any three consecutive elements sum to 7
 */

package PracticeQuestions;
import java.util.*;

public class LuckySeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input daalo idhar
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum =0;
        int f=0;
        for(int i=0;i<n-2;i++){
            sum = arr[i];
            for(int j=i+1;j<i+3;j++){
                sum = sum +arr[j];
            }
            if(sum == 7){
                f=1;
                break;
            }
        }
        if(f == 1){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


        sc.close();
    }
    
}
