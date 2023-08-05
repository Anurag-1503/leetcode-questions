class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    
        int  n = nums.length;
        int[] arr = new int[n];
        //101 because "0 <= nums[i] <= 100"
        int[] table = new int[101];
        int[] ans = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            table[nums[i]]++;
        }
        
        for(int i = 1; i < table.length ; i++){
            table[i] = table[i] + table[i-1];
        }
        
        for(int i = 0 ; i < n; i++){
            if(nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = table[nums[i]-1];
        }
        
        return ans;
    }
}