class Solution {
    public char findKthBit(int n, int k) {
        
        //hint : try to deduce the cases of kth position given
        
        //Base case
        if(n == 1)
            return '0';
        
        //length of the binary string for n
        int length = (int) Math.pow(2 , n) - 1;
        int mid = length/2;
        
        //3 cases of kth bit
        
        if(k <= mid)
            return findKthBit(n-1,k);
        else if (k == mid + 1)//Since we are adding that extra "1" in each new row
            return '1';
        else {
           k = length - k + 1;
           char c = findKthBit(n-1,k);
           return c == '0' ? '1' : '0';
        }
        
    }
}