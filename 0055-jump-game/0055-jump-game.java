class Solution {
    int[] memo;
    public boolean canJump(int[] nums) {
        
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return helper(0,nums);
    }
    
    public boolean helper(int index , int[] nums){
        
        if(index == nums.length - 1)
            return true;
        
        if(memo[index] != -1)
            return (memo[index] == 1);
        //calculate the maximum jump from current index
        //we have to ensure that the maximum jump should be less than nums.length
        int maxJump = Math.min(index + nums[index] , nums.length - 1);
        
        
        for(int position = index + 1 ; position <= maxJump ; position++){
            if(helper(position , nums))
            {
                memo[position] = 1; 
                return true;
            }
                
        }
        memo[index] = 0;
        return false;
    }
}