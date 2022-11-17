class Solution {
    public boolean canJump(int[] nums) {
        int lastgoodIndexPosition = nums.length -1;
        
        for(int i= nums.length -1 ; i>= 0 ; i--)
        {
            if(i+nums[i]>=lastgoodIndexPosition)
            {
                lastgoodIndexPosition =i;
            }
            
        }
        return lastgoodIndexPosition ==0;
    }
}