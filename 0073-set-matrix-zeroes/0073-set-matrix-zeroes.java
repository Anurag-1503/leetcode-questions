class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        int[] rowArray = new int[r];
        int[] colArray = new int[c];
        
        Arrays.fill(rowArray , 1);
        Arrays.fill(colArray , 1);
        
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(matrix[i][j] == 0) {
                    rowArray[i] = 0;
                    colArray[j] = 0;
                }
            }
        }
        
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(rowArray[i] == 0 || colArray[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}