class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1) return nums[0];
        //check for 1st and last element separately as we then start with 2nd and last-1 element
        
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        
        //start binary search with 2nd and last-1 element
        
        int start = 1;
        int end = n-2;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            
            //check for left half
            if( (mid%2 == 1) && nums[mid] == nums[mid-1] || (mid%2 == 0) && nums[mid] == nums[mid+1])
                start = mid + 1;
            //check for right half
            else
                end = mid - 1;
        }
        
        return -1;
        
    }
}