class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] rows: dp)
            Arrays.fill(rows,-1);
        return LCS(0,0,text1,text2,dp);
        
    }
    
    public int LCS(int i, int j, String s1, String s2, int[][] dp){
        if(i==s1.length() || j==s2.length())
            return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 1 + LCS(i+1,j+1,s1,s2,dp);
        
        return dp[i][j] = Math.max(LCS(i,j+1,s1,s2,dp),LCS(i+1,j,s1,s2,dp));
    }
}