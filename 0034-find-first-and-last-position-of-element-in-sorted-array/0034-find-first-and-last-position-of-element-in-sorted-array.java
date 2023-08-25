class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 0)
            return new int[]{-1,-1};
        
        
        int[] res = new int[2];
        //this loop will get the first occurence of the target element
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                res[0] = i;
                break;
            }
            res[0] = -1;
        }
      
        for(int i = nums.length - 1; i >= 0 ; i--){
            if(nums[i] == target)
            {
                res[1] = i;
                break;
            }
            res[1] = -1;
        }
        
        return res;
    }
}