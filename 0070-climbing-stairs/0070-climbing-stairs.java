class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        
        int a =3;
        int b =2;
        
        for(int i =3; i<n ;i++){
            int curr = a+b;
            b = a;
            a = curr;
        }
        return a;
    }
}