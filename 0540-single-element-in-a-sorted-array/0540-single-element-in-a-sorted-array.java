class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        Map<Integer, Integer> fmap = new HashMap<>();
        
        for(int num : nums){
            fmap.put(num, fmap.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : fmap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        return -1;
    }
}