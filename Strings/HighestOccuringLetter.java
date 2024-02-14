package Strings;

import java.util.Scanner;

public class HighestOccuringLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String sentenceWithoutSpaces = sentence.replaceAll("\\s", "");

        char[] charArray = sentenceWithoutSpaces.toCharArray();

        int maxFrequency = 0;
        char highestOccurringLetter = ' ';

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            int currentFrequency = 1; // Initialize frequency to 1 for the current character

            // Count the frequency of the current character in the rest of the array
            for (int j = i + 1; j < charArray.length; j++) {
                if (currentChar == charArray[j]) {
                    currentFrequency++;
                }
            }

            // Update maxFrequency and highestOccurringLetter if the current character has a higher frequency
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                highestOccurringLetter = currentChar;
            }
        }

        System.out.println("Highest occurring letter: " + highestOccurringLetter);
        System.out.println("Frequency: " + maxFrequency);

        sc.close();
    }
}
