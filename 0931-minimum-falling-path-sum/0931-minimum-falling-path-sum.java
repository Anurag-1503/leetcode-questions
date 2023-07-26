class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] dp = new int[rows][cols];
        
        
        for(int j = 0;j<cols;j++){
            dp[0][j] = matrix[0][j];
        }
        
        for(int i = 1;i<rows;i++){
            for(int j = 0;j<cols;j++){
                
                int up = matrix[i][j] + dp[i-1][j];
                
                int leftD = matrix[i][j];
                if(j-1>=0)
                     leftD +=  dp[i-1][j-1];
                else
                    leftD+=(int)Math.pow(10,9);
                int rightD = matrix[i][j];
                if(j+1<cols)
                     rightD += dp[i-1][j+1];
                else
                    rightD+=(int)Math.pow(10,9);
                dp[i][j] = Math.min(up,Math.min(leftD,rightD));
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int j=0;j<cols;j++){
            min = Math.min(min,dp[rows-1][j]);
        }
        return min;
    }
}