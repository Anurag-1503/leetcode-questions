class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        int n = nums.length;
        
        int total = 0;
        for(int val : nums)
            total += val;
        
        int p1 = solve(0,n-1,nums);
        int p2 = total - p1;
        
        return p1>=p2 ? true : false;
        
    }
    
    public int solve(int start , int end , int[] nums) {
        
        if(start > end) {
            return 0;
        }
        
        int takeStart = nums[start] + Math.min(solve(start+2 ,end ,nums) , solve(start+1 ,end-1 ,nums));
        int takeEnd = nums[end] + Math.min(solve(start+1 ,end-1 ,nums) , solve(start ,end-2 ,nums));
        
        return Math.max(takeStart,takeEnd);
    }
}