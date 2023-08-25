class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] inflatedNums = new int[n + 2];
        inflatedNums[0] = inflatedNums[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            inflatedNums[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len <= n; len++) {
            for (int left = 1; left <= n - len + 1; left++) {
                int right = left + len - 1;
                for (int i = left; i <= right; i++) {
                    int coins = inflatedNums[left - 1] * inflatedNums[i] * inflatedNums[right + 1];
                    dp[left][right] = Math.max(dp[left][right], dp[left][i - 1] + coins + dp[i + 1][right]);
                }
            }
        }

        return dp[1][n];
        
    }
}