class Solution {
    public boolean predictTheWinner(int[] nums) {
    
        int totalSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            totalSum += nums[i];
        }
        int p1_score = helper(0,nums.length-1,nums);
        int p2_score = totalSum - p1_score;
        
        return p1_score>=p2_score;
    }
    
    public int helper(int first , int last , int[] nums){
        
        if(first>last){
            return 0;
        }
        
        int take_first = nums[first] + Math.min(helper(first + 2, last , nums) , helper(first + 1 , last - 1 , nums));
        int take_last = nums[last] + Math.min(helper(first + 1 , last - 1 , nums) , helper(first , last - 2 , nums));
        
        return Math.max(take_first , take_last);
        
    }
}