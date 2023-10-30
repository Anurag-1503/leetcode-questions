class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        for(int[] row : dp)
                Arrays.fill(row , -1);
        
        int maxLength = helper(0,nums,-1,dp);
        return maxLength;
        
    }
    
    public int helper(int index, int[] nums, int prev_index , int[][] dp){
        
        if(index == nums.length)
            return 0;
        
        
        if(dp[index][prev_index+1] != -1) return dp[index][prev_index+1];
        
        int include = 0;
        if(prev_index == -1 || nums[index] > nums[prev_index] ){
            include = 1 + helper(index+1,nums,index,dp);
        }
        
        int exclude = helper(index+1,nums,prev_index,dp);
        
        return dp[index][prev_index+1] = Math.max(include,exclude);
    }
    
    
}