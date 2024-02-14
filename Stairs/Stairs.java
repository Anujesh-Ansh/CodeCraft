package Stairs;

public class Stairs {
    public static void main(String[] args) {
        int n;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int f =0;
        System.out.print("Enter the no of Stairs:- ");
        n = sc.nextInt();
        if(n==0){
            System.out.println("No of ways to reach the top:- 0");
            f=-1;
        }
        if(f!=-1){
            int a[] = new int[n];
    
            a[0]=1;
            a[1]=2;
            for(int i=2;i<n;i++){
                a[i]=a[i-1]+a[i-2];
            }
    
            System.out.println("No of ways to reach the top:- "+ a[n-1]);
        }

        sc.close();
    }
}
