package Strings;
import java.util.*;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 words:- ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int sum = word1.length() + word2.length();
        System.out.println("Sum of the lengths of the 2 words:- "+ sum);

        int compare = word1.compareTo(word2);
        if(compare>0){
            System.out.println("'"+word1+"' is lexicographically greater than '"+word2+"'");
        }
        else if(compare<0){
            System.out.println("'"+word1+"' is lexicographically smaller than '"+word2+"'");
        }
        else{
            System.out.println("Both the words are lexicographically equal");
        }
        String res1 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
        String res2 = word2.substring(0, 1).toUpperCase() + word2.substring(1);

        System.out.println(res1 + " "+res2);

        sc.close();
    }
}
