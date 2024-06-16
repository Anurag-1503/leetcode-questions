class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        if(r * c != rows * cols)
            return mat;
        
        if(r == rows && c == cols)
            return mat;
        
        int[][] res_mat = new int[r][c];
        int res_row = 0;
        int res_col = 0;
        
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                res_mat[res_row][res_col] = mat[i][j];
                res_col++;
                
                if(res_col == c) {
                    res_col = 0;
                    res_row++;
                }
            }
        }
        
        
        return res_mat;
        
    }
}