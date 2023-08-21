class Solution {
    public int arrangeCoins(int n) {
        
        int res =0;
        for(res=1;res<=n;res++)             
            n=n-res;
        return res-1;
        
    }
}