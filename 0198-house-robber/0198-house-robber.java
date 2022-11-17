class Solution {
    public int rob(int[] nums) {
        int prev1 = nums[0];  // For value at i-1 index
		int prev2 = 0; // For value at i-2 index
        for(int i = 1; i<nums.length; i++){
            int pick = nums[i] + prev2;
            int notPick = 0 + prev1;
            int curr = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}