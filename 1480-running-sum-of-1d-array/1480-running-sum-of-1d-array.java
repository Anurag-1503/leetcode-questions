class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            count += nums[i];
            ans[i]= count;
        }
        return ans;
    }
}