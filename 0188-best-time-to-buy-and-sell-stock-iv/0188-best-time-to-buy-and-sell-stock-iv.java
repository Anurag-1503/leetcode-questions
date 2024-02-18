class Solution {
    
    int[][][] memo;
    
    public int maxProfit(int k, int[] prices) {
        memo = new int[prices.length][2][k+1];
        for(int[][] rows2 : memo){
            for(int[] rows1 : rows2)
                Arrays.fill(rows1, -1);
        }
        return helper(0, prices, 0, 0, k);
    }
    
    public int helper(int index, int[] arr, int canBuy, int max, int k) {
        if(index == arr.length || max == k)
            return 0;
        
        if(memo[index][canBuy][max] != -1)
            return memo[index][canBuy][max];
            
        int take = 0;
        int nottake = 0;
        
        if(canBuy == 0) {
            take = -arr[index] + helper(index+1, arr, 1, max, k);
            nottake = 0 + helper(index+1, arr, 0, max, k);
        } else {
            take = arr[index] + helper(index+1, arr, 0, max+1, k);
            nottake = 0 + helper(index+1, arr, 1, max, k);
        }
        
        return memo[index][canBuy][max] = Math.max(take, nottake);
    }
}
