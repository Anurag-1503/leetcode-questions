class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1][l2];
        
        for(int[] rows : dp)
            Arrays.fill(rows,-1);
        
        return helper(0,0,text1,text2,dp);
        
    }
    
    public int helper(int i , int j, String str1 , String str2 , int[][]dp ){
        
        if(i == str1.length() || j == str2.length())
            return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(str1.charAt(i) == str2.charAt(j)){
            return 1 + helper(i+1,j+1,str1,str2,dp);
        }
        
        int case1 = helper(i,j+1,str1,str2,dp);
        int case2 = helper(i+1,j,str1,str2,dp);
        return dp[i][j] =  Math.max(case1,case2);
    }
}