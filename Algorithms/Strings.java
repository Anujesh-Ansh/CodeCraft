package Algorithms;

    import java.util.ArrayList;
    import java.util.List;

    public class Strings {
        private static final String[] LETTERS = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        public static List<String> letterCombinations(String digits) {
            List<String> combinations = new ArrayList<>();
            if (digits == null || digits.length() == 0) {
                return combinations;
            }
            backtrack(combinations, digits, new StringBuilder(), 0);
            return combinations;
        }

        private static void backtrack(List<String> combinations, String digits, StringBuilder current, int index) {
            if (index == digits.length()) {
                combinations.add(current.toString());
                return;
            }
            int digit = digits.charAt(index) - '0';
            String letters = LETTERS[digit];
            for (char letter : letters.toCharArray()) {
                current.append(letter);
                backtrack(combinations, digits, current, index + 1);
                current.deleteCharAt(current.length() - 1);
            }
        }

        public static void main(String[] args) {
            String digits = "28";
            List<String> combinations = letterCombinations(digits);
            combinations.sort(null);
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }
    
}


/*
Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. Print the answer in sorted order.
A mapping of digit to letters (just like on the telephone buttons) is given below.
Note
1 does not map to any letters.
2:abc
3:def
4:ghi
5:jkl
6:mno
7:pqrs
8:tuv
9:wxyz 
*/
