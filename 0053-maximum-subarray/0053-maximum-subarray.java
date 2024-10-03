class Solution {
    public int maxSubArray(int[] nums) {
        
        int currBest = nums[0];
        int overallBest = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++) {
            
            if(currBest+nums[i] > nums[i]) {
                currBest += nums[i];
                overallBest =  Math.max(overallBest , currBest);
            }
            else
            {
                currBest = nums[i];
                overallBest = Math.max(overallBest , currBest);
            }
        }
        
        return overallBest;
        
    }
}