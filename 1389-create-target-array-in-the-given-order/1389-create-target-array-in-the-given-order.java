class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int n = nums.length;
        int[] result = new int[n];
        List<Integer> target = new ArrayList<Integer>(n);
        for(int i = 0 ; i<n ; i++)
            target.add(index[i],nums[i]);
        
        for(int i = 0 ; i < n ; i++)
        {
            result[i] = target.get(i);
        }
        return result;
    }
}