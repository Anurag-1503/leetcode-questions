class Solution {
    int[][] memo;
    public int minPathSum(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        memo = new int[rows][cols];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return helper(0,0,rows,cols,grid);
        
    }
    
    public int helper(int i , int j ,  int rows , int cols , int[][] grid){
        
        if(i >= rows || j >= cols)
            return Integer.MAX_VALUE;
        
        if(i == rows - 1 && j == cols - 1)
        {
            return grid[i][j];
        }
        
        if(memo[i][j] != -1)
            return memo[i][j];
        
        int down = helper(i+1,j,rows,cols,grid);
        int right = helper(i,j+1,rows,cols,grid);
        
        return memo[i][j] = grid[i][j] + Math.min(down , right);
    }
}