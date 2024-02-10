class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(0,nums,result,ds);
        return result;
    }
    
    public void helper(int index , int[] nums ,List<List<Integer>> result ,List<Integer> ds){
        
        //base condition
        if(index >= nums.length)
        {
            //if you directly add ds , any change in later backtracking will affect the ds added in result 
            //thats why you need to add a copy of ds
            result.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[index]);
        helper(index + 1, nums , result , ds);
        ds.remove(ds.size()-1);
        helper(index + 1 , nums , result ,ds);
    }
}