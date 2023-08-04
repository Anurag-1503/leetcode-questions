class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        
        for(int[] rows : dp)
            Arrays.fill(rows,-1);
        return LIS(0,-1,nums,dp);
    }
    
    public int LIS(int index, int prev, int[] nums, int[][] dp ){
        if(index == nums.length)
            return 0;
        
        if(dp[index][prev+1]!=-1) return dp[index][prev+1];
        
        
        
        int take = 0;
        int nottake = 0 + LIS(index+1,prev,nums,dp);//not take case
        //we can take only if prev == -1 or it is greater than its prev index
        if(prev == -1 || nums[index] > nums[prev])
            take = 1 + LIS(index+1,index,nums,dp);
        
        
        
        return dp[index][prev+1] = Math.max(take,nottake);
    }
}