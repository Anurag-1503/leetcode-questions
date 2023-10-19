class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int index, int[] candidates , int target ,ArrayList<Integer> ds, List<List<Integer>> ans)
    {
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            
        if (index == candidates.length) {
            return;
        }
        
        //inclusion
        if(candidates[index] <= target)
        {
            ds.add(candidates[index]);
            helper(index+1,candidates,target - candidates[index], ds ,ans);
            ds.remove(ds.size()-1);  
        }
        //exclusion
        while(index < candidates.length - 1 && candidates[index] == candidates[index+1])
        {
            index++;
        }
        helper(index+1,candidates,target,ds,ans);
        
        
    }
}