/*
 * You are given an array of integers. Vasya can permute (change order) its
 * integers. He wants to do it so that as many as possible integers will come on a
 * place where a smaller integer used to stand. Help Vasya find the maximal
 * number of such integers
 */
package PracticeQuestions;
import java.util.*;

public class Vasya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        int cnt = 0;

        for (int i = 0, j = 1; j < n; ) {
            if (v[i] < v[j]) {
                cnt++;
                i++;
            }
            j++;
        }
        System.out.println(cnt);

        sc.close();
    }
}
