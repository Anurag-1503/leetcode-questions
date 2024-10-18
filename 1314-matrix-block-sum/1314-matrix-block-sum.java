class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
       
        int rows = mat.length;
        int cols = mat[0].length;
        int ans[][] = new int[rows][cols];
        
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                int r1 = Math.max(0 , i-k);
                int c1 = Math.max(0 , j-k);
                int r2 = Math.min(rows-1 , i+k);
                int c2 = Math.min(cols-1 , j+k);
                
                for(int a = r1 ; a <= r2 ; a++) {
                    for(int b = c1 ; b <= c2 ; b++) {
                        ans[i][j] += mat[a][b];
                    }
                }
            }
        }
        
        return ans;
        
    }
}