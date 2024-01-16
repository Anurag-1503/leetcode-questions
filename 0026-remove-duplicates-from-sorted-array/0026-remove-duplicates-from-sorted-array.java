class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> res = new HashSet<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            res.add(nums[i]);
        }
        
        List<Integer> arr = new ArrayList<>(res);
        Collections.sort(arr);
        
        for(int i = 0 ; i < arr.size() ; i++){
            nums[i] = arr.get(i);
        }
        
        return arr.size();
        
        
        
    }
}