class Solution {
    int[][] memo;

    public int longestPalindromeSubseq(String s) {
        
        if (s.length() <= 1)
            return s.length();

        memo = new int[s.length()][s.length()];
        for(int[] row : memo)
            Arrays.fill(row, -1);

        return helper(0, s.length() - 1, s);
    }

    public int helper(int start, int end, String s) {
        if (start > end)
            return 0;

        if (memo[start][end] != -1)
            return memo[start][end];

        if (s.charAt(start) == s.charAt(end)) {
            if (start == end)
                return memo[start][end] = 1;
            return memo[start][end] = 2 + helper(start + 1, end - 1, s);
        }

        return memo[start][end] = Math.max(helper(start + 1, end, s), helper(start, end - 1, s));
    }
}
