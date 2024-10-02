class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        int n = mat.length;
        for(int i = 0 ; i < 4 ; i++) {
            if(check(mat ,target))
                return true;
            rotate90(mat,n,n);
        }
        
        return false;
        
    }
    
    public boolean check(int[][] mat , int[][] target) {
        
        for(int i = 0 ; i < mat.length ; i++) {
            for(int j = 0 ; j < mat[0].length ; j++) {
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    
    public void rotate90(int[][] mat , int rows , int cols) {
        
        
        //First we transpose this matrix , i.e. swap elements of upper triangle with elements of lower triangle
        
        for(int i = 0 ; i < rows ; i++) {
            for(int j = i ; j < cols ; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //then we mirror the matrix 
        
        int start = 0;
        int end = cols-1;
        
        while(start <= end) {
            for(int r = 0 ; r < rows ; r++) {
                int temp = mat[r][start];
                mat[r][start] = mat[r][end];
                mat[r][end] = temp;    
            }
            start++;
            end--;
        }
            
    }
}