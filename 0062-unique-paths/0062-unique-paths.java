class Solution {
    
    int[][] memo;
    public int uniquePaths(int m, int n) {
     
        memo = new int[m][n];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return countPaths(0,0,m,n);
        
    }
    
    public int countPaths(int i, int j , int rows , int cols){
        
        //if pointers reaches bottom right(finish)
        if(i == (rows-1) && j == (cols-1))
            return 1;
        
        //if they exceed the boundaries
        if(i >= rows || j >= cols)
            return 0;
        
        if(memo[i][j] != -1)
            return memo[i][j]; 
        
        return memo[i][j] = countPaths(i+1,j,rows,cols) + countPaths(i,j+1,rows,cols);
    }
}