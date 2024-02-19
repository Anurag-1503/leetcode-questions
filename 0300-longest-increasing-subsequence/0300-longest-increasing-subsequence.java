class Solution {

    int memo[][];
    public int lengthOfLIS(int[] nums) {
        
        memo = new int[nums.length+1][nums.length+1];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        //0 is starting index and -1  is previous index, as nothing is previous to 0, we took it as -1
        return helper(0,-1,nums);
        
    }
    
    public int helper(int index , int prev , int[] nums) {
        
        //base condition for out of bound
        if(index >= nums.length)
            return 0;
        
        if(prev != -1 && memo[index][prev] != -1)
            return memo[index][prev];
        //we can take if we are at at first index , so prev will be -1 at first
        //or we can take only if previous element was smaller than current element
        int take = 0;
        if(prev == -1 || nums[prev] < nums[index]){
            //make the prev as current index for next recursive call
            take = 1 + helper(index+1,index,nums);
        }
        
        int skip = 0 + helper(index+1,prev,nums);
        
        if(prev != -1)
            memo[index][prev] = Math.max(take , skip);
        
        return Math.max(take , skip);
    }
}