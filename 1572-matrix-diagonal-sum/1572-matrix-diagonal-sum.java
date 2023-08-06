class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int sum = 0;
        
        int a = 0, b= 0;
        while(a < rows && a < cols && b < rows && b < cols){
            sum += mat[a][b];
            a++;
            b++;
        }
        
        int i = 0, j = cols-1;
        while(i < rows && i >= 0 && j >=0 && j < rows){
            sum += mat[i][j];
            i++;
            j--;
        }
        
        if(rows%2!=0)
            sum = sum - mat[rows/2][cols/2];
        return sum;
    }
}