class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> arr = new HashSet<Integer>();
        int i = 0;
        int j = 0;
        
        while( i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if( nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        
        
        int index = 0;
        int[] res = new int[arr.size()];
        
        for(int k : arr)
            res[index++] = k;
        
        
        
        return res;
    }
}