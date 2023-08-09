class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        if((rows*cols) != (r * c)) return mat;
        
        int[][] arr =new int[r][c];
        
        int row_num = 0;
        int col_num = 0;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols; j++){
                arr[row_num][col_num] = mat[i][j];
                col_num++;
                if(col_num == c){
                    col_num = 0;
                    row_num++;
                }
            }
        }
        return arr;
    }
}