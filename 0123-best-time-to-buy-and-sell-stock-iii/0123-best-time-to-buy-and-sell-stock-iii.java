class Solution {
    
    int[][][] memo;
    public int maxProfit(int[] prices) {
        
        //2 as column because canBuy have only 2 values , 1 or 0
        //3 as third dimension because we can at most have 2 transactions
        memo = new int[prices.length][2][3];
        for(int[][] rows2 : memo){
            for(int[] rows1 : rows2)
            Arrays.fill(rows1,-1);
        }
       //0 indicates that you have space to buy
        //1 indicates that you are full and cant buy
        return helper(0,prices,0,0);
    }
    
    public int helper(int index , int[] arr , int canBuy , int max)
    {
        if(index == arr.length)
            return 0;
        
        if(max == 2)
            return 0;
        
        if(memo[index][canBuy][max] != -1)
            return memo[index][canBuy][max];
            
        int take = 0;
        int nottake = 0;
        //you can buy
        if(canBuy == 0) {
            //you can either buy or skip
            //also make canBuy = 1 so that you can indicate that you are not allowed to buy in next days , you have to sell it first
             take = -arr[index] + helper(index+1,arr,1,max);
            //if you skip , you can buy on next day
             nottake = 0 + helper(index+1,arr,0,max);
        }
        //you cant buy as you already have a stock to sell
        else
        {
            //either you sell it or skip it
            //change canBuy to 0 to show that you have sold the share and can buy on next day
             take = arr[index] + helper(index+1,arr,0,max+1);
            //or you skip it but cant buy on next day
             nottake = 0 + helper(index+1,arr,1,max);
        }
        
        return memo[index][canBuy][max] = Math.max(take, nottake);
    }
}