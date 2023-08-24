class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        
        int length = intersection.size();
        int[] res = new int[length];
        int index = 0;
        
        for(int i : intersection){
            res[index++] = i;
        }
        return res;
        
        
        
    }
    
}