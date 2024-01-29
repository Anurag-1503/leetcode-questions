class Solution {
    public int findMin(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            //check if left half is sorted or not
            if(nums[start] <= nums[mid]){
                //if its sorted , then take the minimum of sorted half
                min = Math.min(min , nums[start]);
                start = mid + 1;
            }
            //check if right half is sorted or not
            if(nums[mid]<= nums[end]){
                //if it is sorted , take the minimum of it
                min = Math.min(min , nums[mid]);
                end = mid - 1;
            }
        }
        
        return min;
        
    }
}