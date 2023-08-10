class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        
        return robRec(nums,nums.length-1,dp);
        
    }
    
    public int robRec(int[] nums, int n, int[] dp){
        if(n<0) {
            return 0;
        }
        if(n==0) return nums[n];
        
        if(dp[n]!=-1) return dp[n];
        int rob = nums[n] + robRec(nums, n-2,dp);
        int dont = robRec(nums, n-1,dp);
        return dp[n] = Math.max(rob , dont);
    }
}