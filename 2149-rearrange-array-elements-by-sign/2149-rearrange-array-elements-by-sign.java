class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        int pos = 0 , neg = 1;
        
        for(int val : nums) {
            if(val >= 0){
                ans[pos] = val;
                pos += 2;
            }
            else {
                ans[neg] = val;
                neg += 2;
            }              
        }
        
        return ans;
        
    }
}