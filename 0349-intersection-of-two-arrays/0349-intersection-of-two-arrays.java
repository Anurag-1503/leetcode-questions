class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        //first copy nums1 to set
        for(int num : nums1)
            set.add(num);
        
        //compare each element of nums2 to set and if found, remove from set to avoid duplicate
        for(int num : nums2){
            if(set.contains(num))
            {
                list.add(num);
                set.remove(num);
            }
        }
        
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }
}