class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        
        helper(0,nums,res,ds);
        return res;
    }
    
    public void helper(int index , int[] nums , List<List<Integer>> res , List<Integer> ds) {
        
        if(index > nums.length-1) {
            res.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[index]);
        helper(index+1,nums,res,ds);
        ds.remove(ds.size()-1);
        helper(index+1,nums,res,ds);
    }
}