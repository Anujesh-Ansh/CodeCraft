import java.util.*;



public class Prime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,i,f;
        System.out.print("Enter the No:- ");
        x=sc.nextInt();
        sc.close();
        double sq =Math.sqrt(x);
        f=0;
        for(i=2;i<=sq;i++){
            if(x%i==0){
                f=1;
                break;
            }
        }
        if(f==1){
            System.out.println("0.00");
        }
        else{
            System.out.printf("%.2f\n",sq);
        }

        
    }
}