class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        return helper(0,nums,dp);
        
    }
    
    public int helper(int index, int[] nums, int[] dp){
        
        int n = nums.length;
        
        if(index == n-1)
            return nums[index];
        
        if(index > n-1)
            return 0;
        
        if(dp[index]!=-1) return dp[index];
        
        int take = nums[index] + helper(index+2,nums,dp);
        int nottake = 0 + helper(index+1,nums,dp);
        
        return dp[index] = Math.max(take,nottake);
    }
}