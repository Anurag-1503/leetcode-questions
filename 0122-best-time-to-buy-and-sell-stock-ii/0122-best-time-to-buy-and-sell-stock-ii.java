class Solution {
    public int maxProfit(int[] prices) {
        
        int buydate = 0;
        int selldate = 0;
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i]>=prices[i-1]){
                selldate++;
            }else{
                profit += prices[selldate] -prices[buydate];
                buydate = selldate = i;
            }
        }
        
        profit += prices[selldate] -prices[buydate];
        return profit;
        
    }
}