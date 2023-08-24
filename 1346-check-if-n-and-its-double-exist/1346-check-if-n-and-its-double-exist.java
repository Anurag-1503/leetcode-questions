class Solution {
    public boolean checkIfExist(int[] arr) {
        
         int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            int target = 2 * arr[i];
            
            int index = binarySearch(arr, target, 0, n - 1);
            
            if (index != -1 && index != i) {
                return true;
            }
        }
        return false;
        
    }
    
    public int binarySearch(int[] arr, int target, int start, int end){
       int left = start;
        int right = end;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}