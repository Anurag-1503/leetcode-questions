class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int sumA = 0;
        int sumB = 0;
        
        for(int num : aliceSizes)
            sumA += num;
        
        for(int num : bobSizes)
            sumB += num;
        
        int[] res = new int[2];
        for(int i = 0 ; i < aliceSizes.length ; i++){
            int sumA_curr = sumA - aliceSizes[i];
            int sumB_curr = sumB + aliceSizes[i];
            int toGive_A = (sumB_curr - sumA_curr)/2;
            int index = BinarySearch(toGive_A , bobSizes);
            if(index != -1){
                res[0] = aliceSizes[i];
                res[1] = bobSizes[index];
                return res;
            }
        }
        
        return res;
        
    }
    
    public int BinarySearch(int target , int[] bob){
        int left = 0;
        int right = bob.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == bob[mid])
                return mid;
            else if(target < bob[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}