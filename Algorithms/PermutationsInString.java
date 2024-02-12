package Algorithms;

// Given a string s, the task is to write a program to print all the permutations of the string.

// Sample Input:- s = “ABC”
// Sample Output:- ABC ACB BAC BCA CBA CAB

public class PermutationsInString {
    public static void main(String[] args) {
        String s = "ABC";
        permute(s, 0, s.length() - 1);
    }

    private static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
