class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1;
        int end = FindMax(piles);
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            int totalhours = CalcTotalHours(piles , mid);
            
            if(totalhours <= h)
                end = mid - 1;
            else
                start = mid + 1;
            
        }
        
        
        return start;
        
        
    }
    
    public int FindMax(int[] arr) {
        
        int maximum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++)
            maximum = Math.max(maximum, arr[i]);
        
        return maximum;
    }
    
    public int CalcTotalHours(int[] arr , int speed){
        
        int total = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
            total += Math.ceil((double)arr[i] / (double)speed);
        
        return total;
    }
}