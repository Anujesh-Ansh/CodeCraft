package SingleDigitSum;

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        int n, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n=sc.nextInt();
        int num =n;

        while(num>9){
            sum=0;
            while(num!=0){
                temp = num % 10;
                sum = sum + temp;
                num = num/10;
            }
            if(sum>9){
                num=sum;
                sum=0;
            }
            else{
                break;
            }
        }
        if(n<=9){
            System.out.println(n);
        }else{
            System.out.println(sum);
        }

        sc.close();
    }
}
