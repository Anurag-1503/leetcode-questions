class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        //store elements wih track of their occurence
        for(int i = 0; i < n; i++){
            int counter = map.getOrDefault(nums[i],0);
            map.put(nums[i],counter+1);
        }
        
        //search for the majority element
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}