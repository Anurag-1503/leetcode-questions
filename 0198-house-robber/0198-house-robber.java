class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int max = findmax(nums.length-1,nums,dp);
        
        return max;
        
        
    }
    
    public int findmax(int index , int[] nums, int[] dp){
        if(index == 0) return nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        
        int pick = findmax(index-2,nums,dp) + nums[index];
        int notpick = findmax(index-1,nums,dp);
        
        return dp[index] = Math.max(pick,notpick);
    }
}