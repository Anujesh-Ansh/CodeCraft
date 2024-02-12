package Backtracking;

public class TrappingWater {
    public static int trapWater(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Calculate the maximum height of bars to the left of each bar
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        
        // Calculate the maximum height of bars to the right of each bar
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        
        // Calculate the amount of water trapped at each bar
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return waterTrapped;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 0, 11, 0, 4};
        int trappedWater = trapWater(arr);
        System.out.println(trappedWater);
    }
}


/*
 * Given an array of N non-negative integers arr[] representing an elevation map
 * where the width of each bar is 1, compute how much water it is able to trap
 * after raining.
 * 
 * Sample Input:-
 * [3,0,2,0,4]
 * 
 * Sample Output:-
 * 7
 * 
 * 
 * Dry Run
 *                 |
 *   |             |
 *   |      |      |
 *   |______|______|
    
*    3  0   2  0   4
 */  
    