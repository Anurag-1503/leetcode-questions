class Solution {
    
    int[][] memo;
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 1) {
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            } else {
                return -1; // Indicate impossibility
            }
        }
        
        memo = new int[coins.length][amount+1];
        for(int[] row : memo)
            Arrays.fill(row , -1);

        int result = helper(0, coins, amount);
        return (result == (int) 1e9) ? -1 : result; // Map large value to -1 for clarity
    }

    public int helper(int index, int[] coins, int amount) {
        if (index == coins.length - 1) {
            if (amount % coins[index] == 0) {
                return amount / coins[index];
            } else {
                return (int) 1e9; // Indicate impossibility
            }
        }
        if(memo[index][amount] != -1)
            return memo[index][amount];

        int nottake = helper(index + 1, coins, amount);
        int take = (amount >= coins[index]) ? 1 + helper(index, coins, amount - coins[index]) : (int) 1e9;

        return memo[index][amount] = Math.min(take, nottake);
    }
}
