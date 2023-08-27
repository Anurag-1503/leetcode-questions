class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] first = new int[intervals.length];
        
        for (int i = 0; i < intervals.length; i++) {
            hm.put(intervals[i][0], i);
            first[i] = intervals[i][0];
        }
        
        Arrays.sort(first);
        int[] ans = new int[intervals.length];
        
        for (int i = 0; i < intervals.length; i++) {
            int key = binarysearch(first, intervals[i][1]);
            
            if (key == first.length) {
                ans[i] = -1;
            } else {
                ans[i] = hm.get(first[key]);
            }
        }
        
        return ans;
    }
    
    public int binarysearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {  // Modified termination condition
            int mid = s + (e - s) / 2;
            
            if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;  // Adjust the right boundary
            }
        }
        
        return s;
    }
}
