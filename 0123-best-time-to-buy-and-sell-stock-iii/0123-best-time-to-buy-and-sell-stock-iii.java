class Solution {
    public int maxProfit(int[] prices) {
        
        int[][][] dp = new int[prices.length][2][3];
        for(int[][] rows2 : dp){
            for(int[] rows1 : rows2)
            Arrays.fill(rows1,-1);
        }
        
        int cap = 2; //capacity is 2 transaction only
        return buyAndSell(0,1,cap,prices,dp); // buy = 1 means you are allowed to buy
        
    }
    
    public int buyAndSell(int ind, int buy, int cap,int[] prices,int[][][] dp){
        
        int profit = 0;
        int n =prices.length;
        //if cap becomes 0, that means you can no longer continue doing transactions
        if(cap == 0) return 0;
        if(ind == n) return 0;
        
        if(dp[ind][buy][cap]!= -1) return dp[ind][buy][cap];
        
        
        //either you can buy/don't buy
        if(buy == 1){
             dp[ind][buy][cap]= Math.max(-prices[ind] + buyAndSell(ind+1,0,cap,prices,dp), 0 + buyAndSell(ind+1,1,cap,prices,dp));
        }
        
        //or you can sell/don't sell
        else{
            dp[ind][buy][cap]= Math.max(prices[ind] + buyAndSell(ind+1,1,cap-1,prices,dp),0 + buyAndSell(ind+1,0,cap,prices,dp));
        }
        
        
        return  dp[ind][buy][cap];
    }
}