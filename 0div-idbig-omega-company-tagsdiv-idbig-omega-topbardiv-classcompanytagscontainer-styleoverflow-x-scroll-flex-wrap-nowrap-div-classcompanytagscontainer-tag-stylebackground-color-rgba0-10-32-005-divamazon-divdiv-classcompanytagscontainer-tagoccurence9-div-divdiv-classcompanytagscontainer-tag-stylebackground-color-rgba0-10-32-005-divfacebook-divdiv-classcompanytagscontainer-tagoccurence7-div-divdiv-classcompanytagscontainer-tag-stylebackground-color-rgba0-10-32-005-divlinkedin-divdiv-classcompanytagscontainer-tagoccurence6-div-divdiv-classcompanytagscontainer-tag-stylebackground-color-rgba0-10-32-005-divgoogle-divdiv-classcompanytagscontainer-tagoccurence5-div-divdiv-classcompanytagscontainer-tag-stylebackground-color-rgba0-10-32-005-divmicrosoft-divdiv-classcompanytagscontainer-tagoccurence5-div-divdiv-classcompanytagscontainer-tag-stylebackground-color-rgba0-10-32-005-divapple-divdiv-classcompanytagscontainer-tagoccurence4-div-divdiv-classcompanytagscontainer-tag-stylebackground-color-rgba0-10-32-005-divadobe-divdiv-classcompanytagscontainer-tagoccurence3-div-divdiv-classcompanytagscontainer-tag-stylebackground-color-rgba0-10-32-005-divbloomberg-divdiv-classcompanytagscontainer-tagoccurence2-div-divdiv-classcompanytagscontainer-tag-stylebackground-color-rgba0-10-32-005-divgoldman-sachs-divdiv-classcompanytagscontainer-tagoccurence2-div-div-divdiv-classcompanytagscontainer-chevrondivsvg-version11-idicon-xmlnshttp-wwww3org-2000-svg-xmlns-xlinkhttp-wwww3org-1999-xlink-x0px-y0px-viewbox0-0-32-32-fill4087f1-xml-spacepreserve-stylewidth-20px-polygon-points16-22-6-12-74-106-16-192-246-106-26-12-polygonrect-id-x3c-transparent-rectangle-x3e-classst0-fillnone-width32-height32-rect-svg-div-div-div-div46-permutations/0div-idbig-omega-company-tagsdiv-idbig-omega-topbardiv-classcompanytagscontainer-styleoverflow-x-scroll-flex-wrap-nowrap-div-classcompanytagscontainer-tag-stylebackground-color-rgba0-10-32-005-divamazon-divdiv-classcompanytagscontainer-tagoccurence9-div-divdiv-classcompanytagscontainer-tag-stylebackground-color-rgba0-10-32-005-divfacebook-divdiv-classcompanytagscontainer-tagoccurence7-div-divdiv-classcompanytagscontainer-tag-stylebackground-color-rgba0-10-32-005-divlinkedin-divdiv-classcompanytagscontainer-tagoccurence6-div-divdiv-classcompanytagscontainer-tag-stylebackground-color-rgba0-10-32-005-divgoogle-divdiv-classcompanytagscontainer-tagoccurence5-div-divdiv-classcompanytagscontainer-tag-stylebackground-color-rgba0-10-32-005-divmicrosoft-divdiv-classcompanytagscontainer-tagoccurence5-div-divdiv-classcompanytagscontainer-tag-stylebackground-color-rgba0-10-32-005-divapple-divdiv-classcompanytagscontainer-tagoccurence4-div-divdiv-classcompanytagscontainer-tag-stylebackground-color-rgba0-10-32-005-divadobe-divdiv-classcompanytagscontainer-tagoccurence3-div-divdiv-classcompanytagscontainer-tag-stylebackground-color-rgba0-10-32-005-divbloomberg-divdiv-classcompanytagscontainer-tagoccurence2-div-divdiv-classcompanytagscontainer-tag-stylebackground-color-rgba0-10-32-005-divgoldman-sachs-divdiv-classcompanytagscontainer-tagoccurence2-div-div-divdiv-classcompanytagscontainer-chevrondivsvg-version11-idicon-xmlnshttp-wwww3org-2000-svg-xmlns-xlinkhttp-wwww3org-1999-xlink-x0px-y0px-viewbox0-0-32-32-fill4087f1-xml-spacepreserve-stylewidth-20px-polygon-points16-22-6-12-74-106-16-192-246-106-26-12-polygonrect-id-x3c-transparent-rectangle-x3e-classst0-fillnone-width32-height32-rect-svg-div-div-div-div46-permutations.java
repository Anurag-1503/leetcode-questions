class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(0,nums,ds,res);
        return res;
        
    }
    
    public void helper(int index, int[] nums,List<Integer> ds,List<List<Integer>> res){
        
        if(index == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = index ; i < nums.length ; i++){
            swap(i,index,nums);
            ds.add(nums[index]);
            helper(index+1,nums,ds,res);
            ds.remove(ds.size()-1);
            swap(i,index,nums);
        }
    }
    
    void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}