class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         //O(n^2)
        //BRUTE FORCE SOLUTION : iterate through all elements in array to find the pair
        
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                
                if(nums[i]+nums[j] == target)
                    return new int[] {i,j};
            }
        }
        //if pair not found , then return {-1,-1} array
        return new int[] {-1,-1};
        
    }
}