class Solution {
    public int waysToSplitArray(int[] nums) {
        
        // Calculate total sum of the array
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        long leftSum = 0;
        int count = 0;
        
        // Iterate and calculate leftSum and rightSum in one pass
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i]; // Update left sum
            long rightSum = totalSum - leftSum; // Calculate right sum as total - left
            
            if (leftSum >= rightSum) {
                count++;
            }
        }
        
        return count;
        
    }
}