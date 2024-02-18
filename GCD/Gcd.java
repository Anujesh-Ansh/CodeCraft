package GCD;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD: " + gcd);
        // int maxGcd = maxGcd(a, b);
        // System.out.println("Max GCD: " + maxGcd);

        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // public static int maxGcd(int a, int b) {
    //     int max = 1;
    //     int min = Math.min(a, b);
    //     for (int i = 2; i <= min; i++) {
    //         if (a % i == 0 && b % i == 0) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }
}



