package CentralJail;

import java.util.Scanner;

public class CentralJail {
    public static void main(String[] args) {
        int t,n,c,s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms u want to run:- ");
        t=sc.nextInt();

        while(t!=0){
            t--;

            System.out.print("Enter the no. of Prisoners:- ");
            n=sc.nextInt();


            System.out.print("Enter the no. of Candies:- ");
            c=sc.nextInt();


            System.out.print("Enter the Starting no.:- ");
            s=sc.nextInt();
            
            int fp = (s+c-1)%n;

            if (fp==0) {
                fp=n;
            }

            System.out.println("-> "+ fp);

        }

        sc.close();
    }
}
