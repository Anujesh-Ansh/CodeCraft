package PracticeQuestions;
import java.util.*;

public class ReverseStack {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        // Push each character of the input string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop each character from the stack and append it to the reversedString
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        

        String reversed = reverseString(input);
        System.out.println(reversed);
    }
}

