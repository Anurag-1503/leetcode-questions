class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        
        //if n is odd, append 0 at the starting of array
        if(n%2!=0){
            arr[0] = 0;
            for(int i = 1 ; i < n-1 ; i++){
                arr[i] = i;
                arr[i+1] = 0-i;
                i++;
                //we incremented i again because we dont want the 2nd i to be overwrite again in next iteration
            }
        }
        else {
             for(int i = 0 ; i < n-1 ; i++){
                arr[i] = i+1;
                arr[i+1] = -(i+1);
                 i++;
            }
            
        }
        
        return arr;
        
    }
}