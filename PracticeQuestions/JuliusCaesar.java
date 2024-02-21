/*
 * Julius Caesar protected his confidential information by encrypting it using a
 * cipher. Caesar's cipher shifts each letter by total number of letters. If the shift
 * takes you past the end of the alphabet, just rotate back to the front of the
 * alphabet
 */


package PracticeQuestions;
import java.util.*;

public class JuliusCaesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // input daalo idhar
        int x = s.length();
        String n ="";
        for(int i=0;i<x;i++){
            int c= (int)s.charAt(i);
            if(c>=65 && c<=90){
                c = c+x;
                if(c>90){
                    c = c-90+64;
                }
            }else if(c>=97 && c<=122){
                c = c+x;
                if(c>122){
                    c = c-122+96;
                }
            }
            n = n + (char)c;
        }
        System.out.println(n);

        sc.close();
    }

}
