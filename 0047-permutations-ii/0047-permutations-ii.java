class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,res);
        return res;
        
    }
    
    public void helper(int index , int[] nums, List<List<Integer>> res) {
        
        List<Integer> ds = new ArrayList<>();
        
        //if index reaches end of the array 
        if(index == nums.length){
             //this means that your nums array is ready(after all swapping) and you can now add it to a 'ds'
            
            for(int i = 0 ; i < nums.length ; i++) {
                ds.add(nums[i]);
            }
            
            res.add(new ArrayList<>(ds));
        }
        
        //swap each elements to every other element including itself
        for(int i = index ; i < nums.length ; i++) {
            if (shouldSwap(nums, index, i)) {
                swap(nums, index, i); // Swap to put the element at the current index
                helper(index + 1, nums, res); // Recurse
                swap(nums, index, i); // Backtrack by undoing the swap
            }
        }
    }
    
    // Function to check if we should swap to avoid duplicates
    private boolean shouldSwap(int[] nums, int start, int current) {
        for (int i = start; i < current; i++) {
            if (nums[i] == nums[current]) {
                return false;
            }
        }
        return true;
    }
    
    // Function to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}