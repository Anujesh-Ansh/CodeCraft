package Backtracking;
import java.util.Arrays;
import java.util.Comparator;

public class WeightProfit {
    public static int knapsack(int[] weights, int[] profits, int capacity) {
        int n = weights.length;

        // Create an array of Item objects to store weights, profits, and profit-to-weight ratios
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], profits[i], (double) profits[i] / weights[i]);
        }

        // Sort the items based on profit-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(Item::getRatio).reversed());

        int maxProfit = 0;
        int currentWeight = 0;

        // Select items greedily until the knapsack capacity is reached
        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].getWeight() <= capacity) {
                maxProfit += items[i].getProfit();
                currentWeight += items[i].getWeight();
            } else {
                int remainingCapacity = capacity - currentWeight;
                maxProfit += (int) (remainingCapacity * items[i].getRatio());
                break;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 1, 4};
        int[] profits = {4, 5, 3, 7};
        int capacity = 5;

        int maxProfit = knapsack(weights, profits, capacity);
        System.out.println("\nMaximum profit from the items in the knapsack: " + maxProfit + "\n");
    }

    // Inner class to represent an item with weight, profit, and profit-to-weight ratio
    static class Item {
        private int weight;
        private int profit;
        private double ratio;

        public Item(int weight, int profit, double ratio) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = ratio;
        }

        public int getWeight() {
            return weight;
        }

        public int getProfit() {
            return profit;
        }

        public double getRatio() {
            return ratio;
        }
    }
}

/*
 * You are given the weights and profits of 'N' items, and a knapsack with a
 * capacity 'C'. Your goal is to maximize the total profit by putting items into
 * the knapsack. Each item can be only be selected once.
 * 
 * Sample Input:-
 * Enter the number of items:4
 * Enter the weights of the items:
 * 2 3 1 4
 * Enter the profits of the items:
 * 4 5 3 7
 * Enter the knapsack capacity:5
 * 
 * Sample Output:-
 * Maximum profit from the items in the knapsack: 10
 */

 /*
  * Dry Run
    *               0     1     2     3     4     5
  0                 0     0     0     0     0     0
  1     2     4     0     0     4     4     4     4
  2     3     5     0     0     4     5     5     9
  3     1     3     0     3     4     7     8     9
  4     4     7     0     3     4     7     8     10
  */