class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int start = FindMax(weights);
        int end = FindSum(weights);
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int RequiredDays = findDays(weights, mid);
            
            if(RequiredDays <= days)
                 end = mid - 1;
            else
               start = mid + 1;
        }
        
        return start;
        
    }
    public int findDays(int[] weights , int capacity){
        int days = 1;
        int load = 0;
        
        for(int i = 0 ; i < weights.length ; i++){
            
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }else
                load += weights[i];
        }
        
        return days;
    }
    
    public int FindMax(int[] arr) {
        
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        return maximum;
    }
    
    public int FindSum(int[] weights){
        
        int totalSum = 0;
        for(int weight : weights)
            totalSum += weight;
        return totalSum;
    }
}