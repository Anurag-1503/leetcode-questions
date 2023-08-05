class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
     
        
       for(int index = n-1; index>=0; index--){
        for (int prev = index-1; prev >=-1; prev--){
                
                
                int take = 0;
                int nottake = 0 + dp[index+1][prev+1];
                //we can take only if prev == -1 or it is greater than its prev index
                if(prev == -1 || nums[index] > nums[prev])
                    take = 1 + dp[index+1][index+1];
            
            dp[index][prev+1] = Math.max(take,nottake);
        
            }
        }
     return dp[0][0];
    }
}