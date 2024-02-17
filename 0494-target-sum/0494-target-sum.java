class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(0,nums,target);
    }
    
    public int helper(int index , int[] nums , int target){
        
        if(index == nums.length)
        {
            if(target == 0)
                return 1;
            return 0;
        }
        
       
        
        int plus = helper(index + 1,nums,target - nums[index]);
        int minus = helper(index + 1, nums , target + nums[index]);
        
        return plus + minus;
    }
}