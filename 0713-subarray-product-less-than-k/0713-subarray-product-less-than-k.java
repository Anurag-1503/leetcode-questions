class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if (k <= 1) return 0; // Edge case: If k is <= 1, no subarray is valid
        
        int count = 0;
        int start = 0;
        int product = 1;
        
        for(int end = 0 ; end < nums.length ; end++) {
            
            product *= nums[end];
            
            while(start <= end && product >= k) {
                product /= nums[start];
                start++;
            }
            
            count += end - start + 1;
            
        }
        
        return count;
    }
}