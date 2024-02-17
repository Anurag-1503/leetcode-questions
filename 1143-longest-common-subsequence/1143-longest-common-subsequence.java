class Solution {
    int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        
        memo = new int[text1.length()][text2.length()];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return helper(0,0,text1,text2);
        
    }
    
    public int helper(int i , int j , String text1, String text2){
        
        if(i >= text1.length() || j >= text2.length())
            return 0;
        
        if(memo[i][j] != -1)
            return memo[i][j];
        
        int matched = 0;
        if(text1.charAt(i) == text2.charAt(j))
            matched = 1 + helper(i+1,j+1,text1,text2);
        int unmatched = 0 + Math.max( helper(i,j+1,text1,text2) , helper(i+1,j,text1,text2));
        
        
        return memo[i][j] =  Math.max(matched , unmatched);
    }
}