class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> fmap = new HashMap<>();
        
        //nums1 element and their frequency count to --> Map
        for(int i : nums1){
            fmap.put(i,fmap.getOrDefault(i,0)+1);
        }
        
        List<Integer> arr = new ArrayList<>();
        //compare with nums2 elements and also keep their frequency in count
        for(int j : nums2){
            if(fmap.containsKey(j) && fmap.get(j) > 0){
                arr.add(j);
                fmap.put(j, fmap.get(j) - 1);
            }
        }
        
        int[] res = new int[arr.size()];
        int index = 0;
        for(int k : arr){
            res[index++] = k;
        }
        
        return res;
        
    }
}