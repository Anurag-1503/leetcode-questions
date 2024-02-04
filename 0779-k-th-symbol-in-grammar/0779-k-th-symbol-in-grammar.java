class Solution {
     public int kthGrammar(int n, double k) {
        // base condition
        if(n==1 && k==1){
            return 0;
        }
        // mid is size of 1st half of grammar generated
        // 1st half elements of row n would always equal to that of row (n-1)
         
        double mid = Math.pow(2,n-1) / 2; 
      
        if(k<=mid)
            return kthGrammar(n-1, k);    
        else{
            int t = kthGrammar(n-1, k-mid);
            return t^1; // XOR // invert
        }
        
    }
}