class Solution {
    
    int[][] memo;
    public int change(int amount, int[] coins) {
        
        memo = new int[coins.length][amount + 1];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        
        return helper(0,coins,amount);
        
    }
    
    public int helper(int index, int[] coins , int amount){
        
        if(amount == 0)
            return 1;
        
        if(index >= coins.length || amount < 0)
            return 0;
        
        if(memo[index][amount] != -1)
            return memo[index][amount];
        
        
        int take = (amount >= coins[index]) ? helper(index , coins , amount-coins[index]) : 0;
        int nottake = helper(index + 1 , coins , amount);
        
        memo[index][amount] =  take + nottake;
        
        return memo[index][amount];
    }
}