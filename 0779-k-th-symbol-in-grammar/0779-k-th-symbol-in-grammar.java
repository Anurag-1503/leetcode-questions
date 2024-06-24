class Solution {
    public int kthGrammar(int n, int k) {
        
        //Base case
        if(n == 1)
            return 0;
        
        int length = (int)Math.pow(2,n-1);
        int mid = length/2;
        
        //cases for Kth bit position
        if(k <= mid)
            return kthGrammar(n-1,k);
        else
        {
            //if k > mid
            k = k - mid;
            int bit = kthGrammar(n-1,k);
            return bit == 0 ? 1 : 0;
        }
    }
}