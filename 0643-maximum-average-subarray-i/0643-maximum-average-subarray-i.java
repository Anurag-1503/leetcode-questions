class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double curr_sum = 0;
        
        for(int i = 0 ; i < k ; i++){
            curr_sum += nums[i];
        }
        
        double max_sum = curr_sum;
        
        for(int i = k ; i < nums.length ; i++){
            curr_sum += nums[i] - nums[i-k];
            max_sum = Math.max(max_sum , curr_sum);
        }
        
        return max_sum/k;
    }
}