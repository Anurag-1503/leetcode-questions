class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> set
            = new HashSet<>();
        findCombinations(0,target,candidates,new ArrayList<>(),set);
        List<List<Integer>> list= new ArrayList<>();
        list = List.copyOf(set);
        return list;
    }
    private void findCombinations(int index,int target,int[] arr,ArrayList<Integer> ds,Set<List<Integer>> set)
    {
    if(index==arr.length)
    {
        if(target==0)
        {
            set.add(new ArrayList<>(ds));
        }
        return;
    }
        if(arr[index]<=target)
        {
            ds.add(arr[index]);
            findCombinations(index,target-arr[index],arr,ds,set);
            ds.remove(ds.size()-1);
        }
     findCombinations(index+1,target,arr,ds,set);
    
    }
}