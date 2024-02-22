/*
 * Print the nth element of the number system
 * Suppose you are in a number system, where if the number doesn’t contain 2 in the unit digit then the number is not valid. So the first number of the number system is 2, the second number is 12, and the third is 22.

 * Input
 * The first line, containing n denotes the number of test cases. then n number of lines for the query.

 * Output
 * Print the consecutive number in the number system for each query.
 */

package PracticeQuestions;
import java.util.Scanner;

public class NthElement {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n - 1) * 10 + 2);

        sc.close();
	}
}
