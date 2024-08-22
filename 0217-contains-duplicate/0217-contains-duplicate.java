class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Map<Integer , Integer> map = new HashMap<>();
        
        for(int val : nums){
            //if we find the val in map && its frequency is more than 1(i.e. it appeared once already in the map) , simply return true
            if(map.containsKey(val) && map.get(val) >= 1 )
                return true;
            //if not , then put it in the map with its default frequency as 1
            map.put(val , map.getOrDefault(val , 0) + 1);
        }
        
        return false;
        
    }
}