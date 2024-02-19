class Solution {
    
    int[][] memo;
    public int maxProfit(int[] prices) {
        
        //2 as column because canBuy have only 2 values , 1 or 0
        memo = new int[prices.length][2];
        for(int[] row : memo){
            Arrays.fill(row , -1);
        }
       //0 indicates that you have space to buy
        //1 indicates that you are full and cant buy
        return helper(0,prices,0);
    }
    
    public int helper(int index , int[] arr , int canBuy)
    {
        if(index >= arr.length)
            return 0;
        
        if(memo[index][canBuy] != -1)
            return memo[index][canBuy];
            
        int take = 0;
        int nottake = 0;
        //you can buy
        if(canBuy == 0) {
            //you can either buy or skip
            //also make canBuy = 1 so that you can indicate that you are not allowed to buy in next days , you have to sell it first
             take = -arr[index] + helper(index+1,arr,1);
            //if you skip , you can buy on next day
             nottake = 0 + helper(index+1,arr,0);
        }
        //you cant buy as you already have a stock to sell
        else
        {
            //either you sell it or skip it
            //change canBuy to 0 to show that you have sold the share and can buy on next day
             take = arr[index] + helper(index+1,arr,0);
            //or you skip it but cant buy on next day
             nottake = 0 + helper(index+1,arr,1);
        }
        
        return memo[index][canBuy] = Math.max(take, nottake);
    }
}