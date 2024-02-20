/*
 * Given an integer n, you have to flip the bits in the binary representation of n.
 * Flipping means changing bit '1' -> '0' and '0' to '1'.
*/

package PracticeQuestions;
import java.util.*;

public class Flipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input daalo idhar
        int r;
        int i=0;
        int sum = 0;
        
        while(n!=0){
            r=n%2;
            sum = sum + r*(int)Math.pow(10,i);
            i++;
            n=n/2;
        }

        int s=0;
        i=0;
        
        while(sum!=0){
            r=sum%10;
            if(r==0){
                r=1;
            }else{
                r=0;
            }
            s= s + r*(int)Math.pow(2,i);
            i++;
            sum=sum/10;
        }
        System.out.println(s);

        sc.close();
        
        // int flipped = n ^ ((1 << Integer.toBinaryString(n).length()) - 1); // a bit complex but the smallest way to do it
        
    }
}