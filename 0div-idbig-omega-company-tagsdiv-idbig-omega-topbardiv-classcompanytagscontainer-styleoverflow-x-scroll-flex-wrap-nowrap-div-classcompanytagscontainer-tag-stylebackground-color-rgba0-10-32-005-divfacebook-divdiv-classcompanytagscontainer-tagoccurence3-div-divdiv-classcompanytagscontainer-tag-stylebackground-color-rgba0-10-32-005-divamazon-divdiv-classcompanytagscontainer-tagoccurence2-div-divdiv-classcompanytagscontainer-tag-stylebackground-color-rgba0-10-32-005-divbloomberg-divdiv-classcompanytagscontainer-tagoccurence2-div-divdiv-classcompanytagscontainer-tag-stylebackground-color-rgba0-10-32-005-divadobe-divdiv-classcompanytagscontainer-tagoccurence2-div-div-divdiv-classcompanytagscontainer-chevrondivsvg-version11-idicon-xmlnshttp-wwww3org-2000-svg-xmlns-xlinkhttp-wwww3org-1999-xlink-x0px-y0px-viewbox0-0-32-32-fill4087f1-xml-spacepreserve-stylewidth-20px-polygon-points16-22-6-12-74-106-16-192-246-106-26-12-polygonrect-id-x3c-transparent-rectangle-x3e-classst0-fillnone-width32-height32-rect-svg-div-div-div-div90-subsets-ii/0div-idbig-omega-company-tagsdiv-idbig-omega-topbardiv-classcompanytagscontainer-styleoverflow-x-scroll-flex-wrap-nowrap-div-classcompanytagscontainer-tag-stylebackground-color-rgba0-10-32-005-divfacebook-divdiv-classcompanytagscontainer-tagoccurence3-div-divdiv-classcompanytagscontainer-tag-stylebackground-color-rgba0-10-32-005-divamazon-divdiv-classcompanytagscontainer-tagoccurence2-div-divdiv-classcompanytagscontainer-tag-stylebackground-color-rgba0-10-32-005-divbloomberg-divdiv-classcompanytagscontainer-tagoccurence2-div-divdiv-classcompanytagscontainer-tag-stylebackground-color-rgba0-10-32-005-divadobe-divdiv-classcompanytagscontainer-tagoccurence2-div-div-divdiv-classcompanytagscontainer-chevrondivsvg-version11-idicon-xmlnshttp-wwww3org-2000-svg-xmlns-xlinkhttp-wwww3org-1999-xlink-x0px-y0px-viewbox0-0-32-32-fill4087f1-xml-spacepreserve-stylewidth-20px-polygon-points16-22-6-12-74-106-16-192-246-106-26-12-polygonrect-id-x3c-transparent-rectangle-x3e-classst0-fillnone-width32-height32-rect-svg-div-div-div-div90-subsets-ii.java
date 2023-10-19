class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,ans,new ArrayList<>());
        return ans;
        
        
    }
    
    public void helper(int index, int[] nums,  List<List<Integer>> ans , ArrayList<Integer> ds){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        int start = index;
        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++; // Skip duplicates
        }
        //inclusion
        ds.add(nums[start]);
        helper(start+1,nums,ans,ds);
        //exclusion
        ds.remove(ds.size()-1);
        helper(index+1,nums,ans,ds);
    }
}