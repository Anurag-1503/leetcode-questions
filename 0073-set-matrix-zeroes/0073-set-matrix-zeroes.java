class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] matrix2 = new int[r][c];
        
        //copying matrix to a new matrix(2)
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }
        
        //traverse in original matrix and set rows and cols zero of matrix2 if encounters a zero in original matrix
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(matrix[i][j] == 0) {
                    //set cols to zero
                    for(int k = 0 ; k < c ; k++)
                        matrix2[i][k] = 0;
                    //set rows to zero
                    for(int k = 0 ; k < r ; k++)
                        matrix2[k][j] = 0;
                }
            }
        }
        
        //now copy all elements from matrix2 to original matrix
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
        
    }
}