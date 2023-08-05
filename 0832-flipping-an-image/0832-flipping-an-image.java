class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int m = image.length;
        int n = image[0].length;
        int[][] arr = new int[m][n];
        
        for(int i = 0;i < m; i++){
            
            for(int j = 0;j < n; j++){
                
                //Horizontal flip
                arr[i][j] = image[i][n-j-1];
                if(arr[i][j] == 1)
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
}