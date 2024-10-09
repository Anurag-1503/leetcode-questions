class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int pivot = -1;
        
        //first find pivot (where nums[i]> nums[i-1])
        for(int i = n-1 ; i > 0 ; i--) {
            if(nums[i-1] < nums[i]) {
                pivot = i-1;
                break;
            }
        }
        
        //if pivot is still -1 , it means the array is in reverse-sorted order
        //and the next permutation of it is the reverse of itself
        
        if(pivot == -1){
            reverse(nums , 0 , n-1);
            return;
        }
        
        //else , find just greater element on the right to pivot , and swap them
        for(int i = n-1 ; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                
                //swap
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                
                break;
            }
        }
        
        //reverse the elements next to pivot
        reverse(nums , pivot+1 , n-1);
        
    }
    
    public void reverse(int[] nums , int l , int r) {
        
        int left = l;
        int right = r;
        
        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}