class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int lastHouse = nums.length - 1;
        return Math.max(findMaxRob(0, lastHouse - 1, nums), findMaxRob(1, lastHouse, nums));
    }
    private int findMaxRob(int first, int lastHouse, int[] nums) {
        int prev2 = nums[first];
        int prev = Math.max(nums[first], nums[first + 1]);
        
        for(int i=first+2 ;i<=lastHouse ;i++) {
            int currRob = Math.max(nums[i] + prev2, prev);
            
            prev2 = prev;
            prev = currRob;
        }
        return prev;
    }
}