class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        int start = 0;
        int end = nums.length - 1;
        int mid = nums.length - k;
        
        reverse(nums,start,mid-1);
        reverse(nums,mid,end);
        reverse(nums,start,end);
        
        
    }
    
    public void reverse(int [] nums , int start , int end){
        
        int left = start;
        int right = end;
        
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}