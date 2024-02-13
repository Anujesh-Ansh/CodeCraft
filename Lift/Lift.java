package Lift;

import java.util.*;

public class Lift {
    public static void main(String[] args) {
        int B = 7;
        int A = 0;
        int dA=0;int dB=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tries: ");
        int t = sc.nextInt();

        while(t!=0){
            System.out.println("Enter the Floor:- ");
            int f1 = sc.nextInt();
            dA = Math.abs(f1 - A);
            dB = Math.abs(B - f1);
            t--;
            if(dA>dB){
                System.out.println("Send B");
                B=f1;
            }
            else{
                System.out.println("Send A");
                A= f1;
            }
        }

        sc.close();
    }
}
