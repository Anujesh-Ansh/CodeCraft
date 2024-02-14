package Strings;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int f=0;
        System.out.print("Enter the first string:- ");
        String st1 = sc.nextLine();
        System.out.print("Enter the second string:- ");
        String st2 = sc.nextLine();

        int s1 = st1.length();
        int s2 = st2.length();

        String str1 = st1.toLowerCase();
        String str2 = st2.toLowerCase();

        if(s1==s2){
            char []a = str1.toCharArray();
            char []b = str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            for(int i=0;i<s1;i++){
                if(a[i]!=b[i]){
                    f=1;
                }
            }
        }
        else{
            f=1;
        }
        if(f==1){
            System.out.println("\nThe strings are not anagrams");
        }
        else{
            System.out.println("\nThe strings are anagrams\n"); 
        }

        sc.close();
    }
}
