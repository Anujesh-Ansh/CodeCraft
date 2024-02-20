/*
 * You are given a number 'N' and you need to check if it is a automorphic number
 * or not. A number is called an automorphic number if and only if the square of
 * the given number ends with the same number itself.
 */

package PracticeQuestions;
import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // input daalo idhar
        int square = N * N;

        int num = N;
        int f=0;

        while(num!=0){
            if(num%10 != square%10){
                f=1;
                break;
            }
            else{
                num = num/10;
                square = square/10;
            }
        }
        if(f>0){
            System.out.println("No");
        }
        else{
            System.out.println("yes");
        }
        sc.close();
    }    
}
