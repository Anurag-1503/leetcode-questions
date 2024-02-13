class Solution {
    // Create an array to store the memoized results
    private int[] memo;

    public int climbStairs(int n) {
        // Initialize the memo array with -1 (indicating no memoization)
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        // Call the helper function with memoization
        return climbStairsHelper(n);
    }

    private int climbStairsHelper(int n) {
        // Base cases
        if (n <= 3) {
            return n;
        }

        // Check if result is already memoized
        if (memo[n] != -1) {
            return memo[n];
        }

        // Calculate and memoize the result
        memo[n] = climbStairsHelper(n - 1) + climbStairsHelper(n - 2);

        // Return the memoized result
        return memo[n];
    }
}
