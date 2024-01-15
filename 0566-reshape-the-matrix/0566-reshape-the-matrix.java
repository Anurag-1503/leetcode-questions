class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        //we have to check if rows*cols == r*c
        //if not equal , return the original matrix mat
        
        if((rows*cols) != (r*c)) return mat;
        
        //create new matrix;
        int res[][] = new int[r][c];
        //take two pointers for rows and cols to insert
        int new_rows = 0;
        int new_cols = 0;
        
        //traverse throught original matrix and insert elements in new matrix
        for(int i = 0; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                
                res[new_rows][new_cols] = mat[i][j];
                //increment new_cols because we have to insert elements column-wise
                new_cols++;
                
                //check if new_cols reaches till 'c' , if yes then reset new_cols to 0 and increment new_row
                if(new_cols == c){
                    new_cols = 0;
                    new_rows++;
                }
            }
        }
        
        return res;
    }
}