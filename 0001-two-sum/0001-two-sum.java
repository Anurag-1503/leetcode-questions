class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        return helper(0,target,nums);
        
    }
    
    public int[] helper(int index, int target, int[] nums){
        if (index >= nums.length) {
            return null;  
        }

        int complement = target - nums[index];

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == complement) {
                return new int[] { index, i };
            }
        }

        return helper(index + 1, target, nums);
    }
}