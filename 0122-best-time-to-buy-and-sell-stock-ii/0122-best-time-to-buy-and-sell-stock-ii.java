class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int[][] dp = new int[n+1][2];
       
        
        //base cases
        dp[n][0] = 0;
        dp[n][1] = 0;
        
        
        for(int index = n-1; index>=0;index--){
            for(int buy = 0; buy <=1; buy++){
                int profit = 0;

                if(buy == 0)// buy = 0  means you can buy the stock 
                    dp[index][buy] = Math.max(0+dp[index+1][0], -prices[index] +dp[index+1][1]);

                if(buy == 1)//buy = 1 means you can sell the stock
                    dp[index][buy] = Math.max(0+dp[index+1][1], prices[index] + dp[index+1][0]);

            }
        }
           
        return dp[0][0];
            
    }
}