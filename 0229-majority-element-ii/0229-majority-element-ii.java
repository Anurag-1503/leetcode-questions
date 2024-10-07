class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        int target = nums.length/3;
        
        
        for(int val : nums)
            map.put(val , map.getOrDefault(val , 0) + 1);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > target)
                res.add(entry.getKey());
        }
        
        return res;
        
    }
}