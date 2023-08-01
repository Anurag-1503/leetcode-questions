class Solution {
    public int minDistance(String word1, String word2) {
        
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] rows : dp)
            Arrays.fill(rows,-1);
      
        return editDistanceUtil(word1, word2, 0, 0, dp);
    }

    static int editDistanceUtil(String S1, String S2, int i, int j, int[][] dp) {
        if (i >= S1.length())
            return S2.length() - j;
        if (j >= S2.length())
            return S1.length() - i;
        if(dp[i][j]!=-1) return dp[i][j];

        if (S1.charAt(i) == S2.charAt(j))
            return dp[i][j] = editDistanceUtil(S1, S2, i + 1, j + 1, dp);

        int insert = editDistanceUtil(S1, S2, i, j + 1, dp);
        int delete = editDistanceUtil(S1, S2, i + 1, j, dp);
        int replace = editDistanceUtil(S1, S2, i + 1, j + 1, dp);

        return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}

