class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int even = 0;
        
        for(int i = 0; i < n; i++){
            String str = Integer.toString(nums[i]);
            if(str.length()%2 == 0)
                even++;
        }
        return even;
    }
}