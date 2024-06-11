class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(Arrays.deepEquals(mat, target))
            return true;
        
        int n = mat.length;
        int[][] rotatedMat = mat;
        
        for(int i = 0 ; i < 3 ; i++) {
            rotatedMat = rotate90Clockwise(rotatedMat , n);
            if(Arrays.deepEquals(rotatedMat , target))
                return true;
        }
        
       
    return false;
        
    }
        
      public int[][] rotate90Clockwise(int[][] mat, int n) {
        int[][] newMat = new int[n][n];
        
        // Rotate the matrix by 90 degrees clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMat[j][n - 1 - i] = mat[i][j];
            }
        }

        return newMat;
    }
}