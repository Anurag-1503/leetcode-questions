class NumMatrix {

    int[][] psum;
    
    public NumMatrix(int[][] matrix) {
        
        psum = matrix;
        int r = matrix.length;
        int c = matrix[0].length;
        
        //cumulative sum of row elements
        for(int i = 0 ; i < r ; i++) {
            for(int j = 1 ; j < c ; j++) {
                psum[i][j] += psum[i][j-1];
            }
        }
        //cumulative sum of column elements
        for(int j = 0 ; j < c ; j++) {
            for(int i = 1 ; i < r ; i++) {
                psum[i][j] += psum[i-1][j];
            }
        }
        
        //now we have our prefix sum array ready
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
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

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */