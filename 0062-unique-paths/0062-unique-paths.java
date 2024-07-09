class Solution {
    
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return helper(0,0,m,n);
    }
    
    public int helper(int start_r , int start_c , int rows , int cols){
        
        
        if(start_r == (rows-1) && start_c == (cols-1))
           return 1;
        
        if(start_r >= rows || start_c >= cols)
            return 0;
        
        if(memo[start_r][start_c] != -1)
            return memo[start_r][start_c];
        
        //move in all possible directions
        //downward
        int down = helper(start_r + 1, start_c , rows, cols);
        int right = helper(start_r , start_c + 1 , rows , cols);
        
        memo[start_r][start_c] = down+right;
        return memo[start_r][start_c];
    }
}