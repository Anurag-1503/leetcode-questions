class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;
        int mid = n - k;
        reverse(0 , mid -1 , nums);
        reverse(mid , n-1 , nums);
        reverse(0 , n-1 , nums);
    }
    
    public void reverse(int start , int end , int[] nums) {
        
        int left = start;
        int right = end;
        
        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}