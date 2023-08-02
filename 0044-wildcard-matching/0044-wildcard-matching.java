class Solution {
    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length();
        
        boolean[][] dp = new boolean[n + 1][m + 1];
        
        // Base Case
        dp[0][0] = true;
        
        for (int j = 1; j <= m; j++) {
            dp[0][j] = false;
        }
        
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int k = 1; k <= i; k++) {
                if (p.charAt(k - 1) != '*') {
                    flag = false;
                    break;
                }
            }
            dp[i][0] = flag;
        }
        
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If match found or '?' is found 
                if (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // if it is a '*'
                else if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }

                // No match found
                else dp[i][j] = false;
            }
        }
        
        return dp[n][m];
    }
}