class Solution {
    int[] memo ;
    public int rob(int[] nums) {
        
        memo = new int[nums.length];
        Arrays.fill(memo , -1);
        int n = nums.length - 1;
        return helper(n,nums);
        
    }
    
    public int helper(int index , int[] nums){
        if(index == 0)
            return nums[index];
        
        if(index < 0)
            return 0;
        
        if(memo[index] != -1)
            return memo[index];
        
        int pick = nums[index] + helper(index - 2 , nums);
        int notpick = 0 + helper(index - 1 , nums);
        
        memo[index] = Math.max(pick , notpick);
        
        return memo[index];
    }
}