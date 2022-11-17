class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int [2];
        result[0]= findstartingindex(nums , target);
        result[1]= findendingindex(nums , target);
        return result;
    }
    
    public int findstartingindex(int [] nums, int target)
    {
        int index=-1;
        int start = 0;
        int end = nums.length-1;
        
        while( start <= end)
        {
            int midpoint = start + (end - start) /2;
            if(nums[midpoint] >=  target)
            {
                end = midpoint-1;
            }
            else
            {
                start = midpoint +1;
            }
            if(nums[midpoint] == target)
                index = midpoint;
            
        }
        return index ;
    }
    
    public int findendingindex(int [] nums, int target)
    {
        int index=-1;
        int start = 0;
        int end = nums.length-1;
        
        while( start <= end)
        {
             int midpoint = start + (end - start) /2;
            
            if(nums[midpoint] <=  target )
            {
                start = midpoint+1;
            }
            else 
            {
                end =  midpoint -1;
            }
            if(nums[midpoint]== target)
                index = midpoint;
        }
        return index;
    }
}