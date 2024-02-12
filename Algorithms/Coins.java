package Algorithms;

public class Coins {
    public static int minCoins(int[] coins, int V) {
        // Base case: If V is 0, no coins are needed
        if (V == 0) {
            return 0;
        }

        // Initialize result to maximum value
        int result = Integer.MAX_VALUE;

        // Try all coins one by one
        for (int i = 0; i < coins.length; i++) {
            // If the current coin value is less than or equal to V
            if (coins[i] <= V) {
                // Recursively find the minimum number of coins needed for the remaining value
                int subResult = minCoins(coins, V - coins[i]);

                // If the subResult is not -1 (indicating it's possible to make change)
                // and the subResult + 1 is less than the current result, update the result
                if (subResult != -1 && subResult + 1 < result) {
                    result = subResult + 1;
                }
            }

            
        }

        // If result is still maximum value, it means it's not possible to make change
        // Return -1, otherwise return the result
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        int[] coins = { 1,11, 5, 1};
        int V = 11;
        int minCoins = minCoins(coins, V);
        System.out.println("Minimum coins required is " + minCoins);
    }
}