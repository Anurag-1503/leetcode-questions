class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < k ; i++) {
            curr += arr[i];
        }
        if(curr/k >= threshold)
            count++;
        
        for(int i = k ; i < arr.length ; i++) {
            curr += arr[i] - arr[i-k];
            
            if(curr/k >= threshold)
                count++;
        }
        
        return count;
    }
}