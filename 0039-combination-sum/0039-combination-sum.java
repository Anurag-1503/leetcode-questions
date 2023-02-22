class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        findCombinations(0,target,candidates,new ArrayList<>(),list);
        return list;
    }
    private void findCombinations(int index,int target,int[] arr,ArrayList<Integer> ds,List<List<Integer>> list)
    {
    if(index==arr.length)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(ds));
        }
        return;
    }
        if(arr[index]<=target)
        {
            ds.add(arr[index]);
            findCombinations(index,target-arr[index],arr,ds,list);
            ds.remove(ds.size()-1);
        }
     findCombinations(index+1,target,arr,ds,list);
    
    }
}