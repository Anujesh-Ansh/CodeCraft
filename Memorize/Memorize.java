package Memorize;

public class Memorize {
    static int counter = 0;
    public static void main(String[] args) {
        int n;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the no of Numbers:- ");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.print("Enter the Numbers:- ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number of Queries:- ");
        int q = sc.nextInt();

        while(q!=0){
            System.out.println("Enter the number (query):- ");
            int x= sc.nextInt();
            q--;
            counter=0;

            for(int i=0;i<n;i++){
                if(a[i]==x){
                    counter++;
                }
            }
            if(counter!=0){
                System.out.println("Occurence-> "+ counter);
            }
            else{
                System.out.println("No");
            }

    }
    sc.close();
}
}
