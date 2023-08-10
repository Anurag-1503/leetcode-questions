class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        List<Integer> range = new ArrayList<>();
        int[] res = new int[2];
        Arrays.fill(res,-1);
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                range.add(i);
            }
        }
        
        if(range.size() == 0) 
            return res;
        
        res[0] = range.get(0);
        res[1] = range.get(range.size()-1);
        
        return res;
    }
}