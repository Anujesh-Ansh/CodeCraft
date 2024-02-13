package PerfectSquare;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x=sc.nextInt();
        int sq =(int) Math.sqrt(x);

        if(sq*sq == x){
            System.out.println("The given number is a perfect square");
        }else{
            System.out.println("The given number is not a perfect square");
        }
        sc.close();
    }
}
