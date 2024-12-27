class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zeroCount = 0;
        int maxLength = 0;
        int start = 0;
        
        for(int end = 0 ; end < nums.length ; end++) {
            
            //if we encounter a 0 , increment zeroCount
            if(nums[end] == 0)
                zeroCount++;
            
            //if zeroCount exceeds k , shrink the window from left(start)
            if(zeroCount > k) {
                if(nums[start] == 0)
                    zeroCount--;
                start++;
            }
            
            maxLength = Math.max(maxLength , end - start + 1);
        }
        
        return maxLength;
        
    }
}