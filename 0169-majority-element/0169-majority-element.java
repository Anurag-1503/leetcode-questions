class Solution {
    public int majorityElement(int[] nums) {
        
        int candidate = 0;
        int vote = 0;
        
        for(int val : nums) {
            
            if(vote == 0)
            {
                candidate = val;
                vote++;
            }
                
            else if(val == candidate)
                vote++;
            else 
                vote--;
        }
        
        return candidate;
        
    }
}