class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}