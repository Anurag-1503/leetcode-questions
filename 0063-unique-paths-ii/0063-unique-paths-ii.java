class Solution {
    int[][] memo;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if(obstacleGrid[m-1][n-1] == 1) return 0;
            
            
        memo = new int[m][n];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return countPaths(0,0,m,n,obstacleGrid);
           
    }
    
    public int countPaths(int i, int j , int rows , int cols ,int[][] obstacleGrid){
        
        //if pointers reaches bottom right(finish)
        if(i == (rows-1) && j == (cols-1))
            return 1;
        
        //if they exceed the boundaries
        if(i >= rows || j >= cols || obstacleGrid[i][j] == 1)
            return 0;
        
        if(memo[i][j] != -1)
            return memo[i][j]; 
        
        return memo[i][j] = countPaths(i+1,j,rows,cols,obstacleGrid) + countPaths(i,j+1,rows,cols,obstacleGrid);
    }
}


    
    