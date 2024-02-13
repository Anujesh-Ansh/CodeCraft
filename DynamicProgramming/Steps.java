package DynamicProgramming;


/*
 * A naughty kid is climbing stairs with N steps. From any step, he can take 1
 * step or 2 step at a time. Find the total distinct ways of reaching Nth step.
 * Assume he is standing on 0th step.
 * 
 * Sample Input:-
 * 15
 * 
 * Sample Output:-
 * 987
 * 
 * 
 * Code using dynamic programming
 */


public class Steps {
    public static int countDistinctWays(int n) {
        if (n <= 1) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        return countDistinctWaysHelper(n, dp);
    }
    
    private static int countDistinctWaysHelper(int n, int[] dp) {
        if (dp[n] != 0) {
            return dp[n];
        }
        
        dp[n] = countDistinctWaysHelper(n - 1, dp) + countDistinctWaysHelper(n - 2, dp);
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;
        int distinctWays = countDistinctWays(n);
        System.out.println(distinctWays);
    }
}

