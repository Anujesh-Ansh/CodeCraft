/*
 * Even Digits on Even Dates

 * Due to pollution Delhi government has applied odd even rule in Delhi ie 
 * vehicles with registration numbers ending with an odd digit will be allowed on roads on odd dates 
 * and those with an even digit on even dates. Traffic police on guard are recording the registration number 
 * of vehicles passing through their area and storing the last digit of the number in A. 
 * You are given the number A and date of the day B. Also fine for breaking the rule is C Rs. 
 * Find whether the car with the given registration number is fined or not?.if fined, 
 * print "A fine of Crs is collected" else print "No fine is collected"

 * Input
 * 3 31 100

 * Output
 * No fine is collected

 */

package PracticeQuestions;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ( (a%2 == 0 && b%2 == 0) || (a%2 !=0 && b%2 !=0) ){
            System.out.println("No fine is collected");
        }else{
            System.out.println("A fine of "+c+" rs is collected");
        }
        
        sc.close();
    }
    
}
