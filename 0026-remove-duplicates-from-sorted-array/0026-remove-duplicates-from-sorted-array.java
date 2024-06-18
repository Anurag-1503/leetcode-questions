class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 1; //since 1st element will be always unique , we start with position 2(1st index)
        
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] != nums[i-1]) //we have encountered a unique element
            {
                nums[j] = nums[i]; //place the unique element at j and increment it for next unique element
                j++;
            }
        }
        
        return j; //this will indicate the length of nums array till all unique elements
        
    }
}