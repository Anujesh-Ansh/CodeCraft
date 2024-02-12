package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PermutationsInFrequency {
    public static void main(String[] args) {
        int num = 12;
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(num, new ArrayList<>(), permutations);
        for (List<Integer> permutation : permutations) {
            for (int factor : permutation) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }

    private static void backtrack(int num, List<Integer> factors, List<List<Integer>> permutations) {
        if (num == 1) {
            permutations.add(new ArrayList<>(factors));
            return;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                backtrack(num / i, factors, permutations);
                factors.remove(factors.size() - 1);
            }
        }
    }
}