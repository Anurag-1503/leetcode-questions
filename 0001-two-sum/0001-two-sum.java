class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //o(n)
        //optimized solution : use a map to store element with its index , and concurrently check if 
        //complement exists in map, if yes then pair found (return it) , else return {-1,-1}
        Map<Integer , Integer> map = new HashMap<>();
       
       for(int i = 0 ; i < nums.length ; i++){
           
           int complement = target - nums[i];
           
           if(map.containsKey(complement))
               return new int[] {i , map.get(complement)};
           
           map.put(nums[i] , i);
       }
       
       return new int[] {-1,-1};
        
    }
}