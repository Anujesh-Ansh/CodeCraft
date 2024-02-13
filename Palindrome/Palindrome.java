package Palindrome;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        int n,num,sum,r;
        r=sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        n=sc.nextInt();
        num=n;
        
        while(n!=0){
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is a palindrome number");
        }else{
            System.out.println(num+" is not a palindrome number");
        }
        sc.close();

    }
}