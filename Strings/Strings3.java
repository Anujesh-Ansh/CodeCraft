package Strings;
import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();

        System.out.println("Enter the length of substrings (k):");
        int k = sc.nextInt();

        String minSubstring = null;
        String maxSubstring = null;

        for (int i = 0; i <= str1.length() - k; i++) {
            String currentSubstring = str1.substring(i, i + k);

            if (minSubstring == null || currentSubstring.compareTo(minSubstring) < 0) {
                minSubstring = currentSubstring;
            }

            if (maxSubstring == null || currentSubstring.compareTo(maxSubstring) > 0) {
                maxSubstring = currentSubstring;
            }
        }

        System.out.println("Minimum lexicographic substring: " + minSubstring);
        System.out.println("Maximum lexicographic substring: " + maxSubstring);

        sc.close();
    }
}
