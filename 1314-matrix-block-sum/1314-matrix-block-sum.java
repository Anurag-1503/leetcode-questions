class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
       
        int rows = mat.length;
        int cols = mat[0].length;
        int ans[][] = new int[rows][cols];
        
        int psum[][] = mat;
        
        //cumulative sum of row elements
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 1 ; j < cols ; j++) {
                psum[i][j] += psum[i][j-1];
            }
        }
        //cumulative sum of column elements
        for(int j = 0 ; j < cols ; j++) {
            for(int i = 1 ; i < rows ; i++) {
                psum[i][j] += psum[i-1][j];
            }
        }
        
        //now we have our prefix sum array ready
        
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                int r1 = Math.max(0 , i-k);
                int c1 = Math.max(0 , j-k);
                int r2 = Math.min(rows-1 , i+k);
                int c2 = Math.min(cols-1 , j+k);
                
                ans[i][j] = sumRegion(psum , r1 , c1 , r2 , c2);
            }
        }
        
        return ans;
        
    }
    
    public int sumRegion(int[][] psum , int row1, int col1, int row2, int col2) {
        
        int res = psum[row2][col2];
        if(row1 > 0)
            res -= psum[row1-1][col2];
        if(col1 > 0)
            res -= psum[row2][col1-1];
        if(row1 > 0 && col1 > 0)
            res += psum[row1-1][col1-1];
        
        return res;
        
    }
}