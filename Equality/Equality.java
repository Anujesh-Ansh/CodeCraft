package Equality;

import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        x=sc.nextInt();
        y=sc.nextInt();

        if((x^y)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //New Way
        // Integer n1 = new Integer(x);
        // Integer n2 = new Integer(y);
        // System.out.println(n1.equals(n2));
        sc.close();
    }
}
