class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Set<Integer> arr = new HashSet<>();
        
        for(int i : nums2){
            if(binarySearch(nums1, i)){
                arr.add(i);
            }
        }
        
        //convert arraylist to array
        int index = 0;
        int[] res = new int[arr.size()];
        
        for(int i : arr){
            res[index] = i;
            index++;
        }
        return res;
        
    }
    
    public boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        
        return false;
    }
}