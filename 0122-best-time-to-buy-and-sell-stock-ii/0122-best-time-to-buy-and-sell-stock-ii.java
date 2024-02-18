class Solution {
    public int maxProfit(int[] prices) {
        
        int buydate = 0;
        int selldate = 0;
        int profit = 0;
        
        for(int i = 1 ; i < prices.length ; i++){
            //if graph is going up , increment the selldate
            if(prices[i] >= prices[i-1])
                selldate++;
            else
            {
                //if counter a drop in graph , then collect the profit and reset the buyandselldates on currentdate
                profit += prices[selldate] - prices[buydate];
                buydate = i;
                selldate = i;
            }
        }
        //there might exist one more transaction at last , so include it too
        profit += prices[selldate] - prices[buydate];
        
        return profit;
    }
}