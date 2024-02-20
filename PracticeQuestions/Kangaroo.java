/*
 * You are choreographing a circus show with various animals. For one act, you
 * are given two kangaroos on a number line ready to jump in the positive
 * direction (i.e, toward positive infinity).

 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.

 * You have to figure out a way to get both kangaroos at the same location at the same 
 * time as part of the show. If it is possible, return YES, otherwise return NO.
 */
package PracticeQuestions;
import java.util.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); // input daalo idhar
        int v1 = sc.nextInt(); // input daalo idhar
        int x2 = sc.nextInt(); // input daalo idhar
        int v2 = sc.nextInt(); // input daalo idhar

        if(x2 > x1 && v2 > v1){
            System.out.println("NO");
        }else if(x1 > x2 && v1 > v2){
            System.out.println("NO");
        }else if(x1 == x2 && v1 == v2){
            System.out.println("YES");
        }
        else if(x1 == x2){
            if(v1 != v2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        else if(v1 == v2){
            if(x1 != x2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        else {
            System.out.println("YES");
        }
        sc.close();
            
    }
    
}
