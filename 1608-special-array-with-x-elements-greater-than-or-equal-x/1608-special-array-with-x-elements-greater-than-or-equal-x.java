class Solution {
    public int specialArray(int[] nums) {
        
        
        for(int i = 1 ; i < 1001 ; i++){
            int count = 0;
            for(int num : nums){
                if(num >= i)
                    count++;
            }
            if(count == i)
                return count;
        }
        
        return -1;
        
    }
}