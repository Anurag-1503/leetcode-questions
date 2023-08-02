class Solution {
    public int maxProfit(int[] prices) {
        
        int[][] dp = new int[prices.length][2];
        //2 because there can be two values possible for variable buy
        for(int[] rows : dp)
            Arrays.fill(rows,-1);

        return buyorsell(0,0,prices.length,prices,dp);
        
    }
    
    public int buyorsell(int index, int buy, int n,int[] prices, int[][] dp)
    {
        int profit = 0;
        
        if(index == n) return 0;
        
        if(dp[index][buy] != -1) return dp[index][buy];
        
        if(buy == 0)// buy = 0  means you can buy the stock 
            dp[index][buy] = Math.max(0+buyorsell(index+1,0,n,prices,dp), -prices[index] +                                 buyorsell(index+1,1,n,prices,dp));
        
        if(buy == 1)//buy = 1 means you can sell the stock
            dp[index][buy] = Math.max(0+buyorsell(index+1,1,n,prices,dp), prices[index] +                                   buyorsell(index+1,0,n,prices,dp));
        
        return dp[index][buy];
            
    }
}