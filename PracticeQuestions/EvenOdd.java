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
