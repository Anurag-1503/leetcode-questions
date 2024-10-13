class Solution {
    public int pivotIndex(int[] nums) {
        
         int totalSum = 0, leftSum = 0;
        
        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Iterate through the array and check if current index is the middle index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the middle index
            }
            
            leftSum += nums[i]; // Update left sum for the next index
        }
        
        return -1; // No valid middle index found
        
    }
}