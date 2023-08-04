class Solution {
    public int maxProfit(int[] prices) {
            
        int profit = 0;
        int n =prices.length;
        
        
        int[][][] dp = new int[prices.length+1][2+1][3+1];
        for(int[][] rows2 : dp){
            for(int[] rows1 : rows2)
            Arrays.fill(rows1,0);
         }
        
    
        //base case 1: for cap == 0 , ind and buy can be anything
        for(int index = n-1;index>=0;index--){
            for(int buy = 0; buy<=1;buy++){
                dp[index][buy][0] = 0;
            }
        }
        
        //base case 2: for index == n, buy and cap can be anything
        for(int buy = 0; buy <= 1; buy++){
            for(int cap = 0;cap<=2;cap++){
                dp[n][buy][cap] = 0;
            }
        }
        
        for(int ind = n-1; ind>=0;ind--){
            for(int buy = 0; buy <= 1; buy++){
                //cap starts from 1 because in base case for cap =0,everything already is calculated
                for(int cap = 1; cap <= 2;cap++){
                    if(buy == 1){
                        dp[ind][buy][cap]= Math.max(-prices[ind] + dp[ind+1][0][cap], 0 + dp[ind+1][1][cap]);
        }
        
         //or you can sell/don't sell
                    else{
                        dp[ind][buy][cap]= Math.max(prices[ind] + dp[ind+1][1][cap-1] ,0 + dp[ind+1][0][cap]);
        }
                }
            }
        }
      
        
        
        //either you can buy/don't buy
        
        
        
        return  dp[0][1][2];
    }
}