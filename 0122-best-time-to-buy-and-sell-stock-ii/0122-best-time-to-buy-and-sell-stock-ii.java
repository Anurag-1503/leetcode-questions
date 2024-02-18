class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int currProfit = 0;
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                currProfit += prices[i] - prices[i - 1];
            } else {
                totalProfit += currProfit;
                currProfit = 0;
                min = prices[i]; // Update min for the next potential buy point
            }
        }

        totalProfit += currProfit; // Add any remaining profit

        return totalProfit;
    }
}
