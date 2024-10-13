class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Iterate through the array and check if current index is the middle index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i]; // Right sum is total sum minus left sum and current element
            
            if (leftSum == rightSum) {
                return i; // Found the middle index
            }
            
            leftSum += nums[i]; // Update left sum for the next index
        }
        
        return -1; // No valid middle index found
    }
}
