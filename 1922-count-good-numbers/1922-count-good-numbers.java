class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        return (int)((power(5,(n+1)/2) * power(4,n/2))%mod);
    }

    long power(long x,long n){
        if(n==0) 
            return 1;
        else if(n%2==0) 
            return power((x*x)%mod,n/2)%mod;
        else 
            return (x*power((x*x)%mod,(n-1)/2)%mod)%mod;
    }
}