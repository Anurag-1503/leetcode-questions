class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        for(int i = 0 ; i < nums.length ; i++){
            
            //1 : if index is 0
            if(i == 0 && nums[i] != nums[i+1])
                    return nums[i];
            //2 : if index is last
            else if(i == nums.length - 1 && nums[i] != nums[i-1])
                    return nums[i];
            //3 : rest elements
            else if(i > 0 && i < nums.length - 1 && nums[i] != nums[i+1] && nums[i] != nums[i-1])
                    return nums[i];
                
        }
        
        return -1;
        
    }
}