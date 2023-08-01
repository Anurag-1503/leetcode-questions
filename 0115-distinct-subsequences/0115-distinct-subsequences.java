class Solution {
    public int numDistinct(String s, String t) {
        
        int[][] dp = new int[s.length()][t.length()];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        
        return distinctSub(0,0,s,t,dp);
    }
    
    public int distinctSub(int i, int j , String s, String t,int[][] dp){
        if(j>t.length()-1) return 1;
        if(j<=t.length()-1 && i>s.length()-1) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        
            if(s.charAt(i) == t.charAt(j))
                return dp[i][j] = distinctSub(i+1,j+1,s,t,dp) + distinctSub(i+1,j,s,t,dp);
            else
                return dp[i][j] = distinctSub(i+1,j,s,t,dp);
    }
}