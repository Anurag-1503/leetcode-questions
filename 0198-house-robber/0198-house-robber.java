class Solution {
    
    int[] memo;
    public int rob(int[] nums) {
        
        memo = new int[nums.length];
        Arrays.fill(memo , -1);
        return helper(0,nums);
        
    }
    
    public int helper(int index , int[] nums) {
        
        if(index >= nums.length)
            return 0;
        
        if(memo[index] != -1)
            return memo[index];
        
        //steal condition
        int steal = nums[index] + helper(index+2 , nums);
        int skip = helper(index+1 , nums);
        
        memo[index] = Math.max(steal , skip);
        
        return memo[index];
    }
}