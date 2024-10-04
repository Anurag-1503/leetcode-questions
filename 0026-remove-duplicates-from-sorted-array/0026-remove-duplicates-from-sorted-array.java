class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        //since 1st element will always be unique , we have to start with 1st index(2nd element)
        int j = 1; 
        
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] != nums[i-1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}