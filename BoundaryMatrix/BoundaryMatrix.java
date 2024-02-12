package BoundaryMatrix;

public class BoundaryMatrix {
    public static void main(String[] args) {
        int r,c;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the Size of the Matrix:- ");
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][] = new int[r][c];

        System.out.print("Enter the Numbers:- ");
        for(int i = 0;i<r;i++){
            for(int j =0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Sum of Boundary Matrix elements (clockwise):- ");



        for(int j=0;j<c;j++){
            System.out.print(a[0][j]+" ");
        }
        for(int i=1;i<r;i++){
            System.out.print(a[i][c-1]+" ");
        }
        for(int j=c-2;j>=0;j--){
            System.out.print(a[r-1][j]+" ");
        }
        for(int i=r-2;i>0;i--){
            System.out.print(a[i][0]+" ");
        }

        System.out.println("\n");

        sc.close();
    }
}
