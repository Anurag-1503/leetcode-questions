class Solution {
    public int findMin(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        int minValue = Integer.MAX_VALUE;
        for (int num : map.keySet()) {
            minValue = Math.min(minValue, num);
        }
        return minValue;
        
    }
}