class Solution {
    public int minDistance(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
    
        
        for(int i = 0; i<=m;i++){
            dp[i][0] =  i;
        }
        for(int j = 0; j<=n;j++){
            dp[0][j] = j;
        }
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = 0+dp[i-1][j-1];
            
                else dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }

        

        return dp[m][n];
    }
}

