class Solution {
    
    int[] memo;
    public boolean canJump(int[] nums) {
        
        memo = new int[nums.length];
        Arrays.fill(memo , -1);
        return helper(0 , nums);
        
    }
    
    public boolean helper(int index, int[] nums) {
        if(index == nums.length - 1)
            return true;
        
        if(memo[index] != -1)
            return (memo[index] == 1);
        
        for(int i = 1 ; i <= nums[index] ; i++) {
            if(helper(index+i , nums))
            {
                memo[index] = 1;
                return true;
            }
                
        }
        
        memo[index] = 0;
        return false;
    }
}