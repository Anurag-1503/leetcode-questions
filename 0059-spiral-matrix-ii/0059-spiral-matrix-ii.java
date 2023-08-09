class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        int counter = 1;
        
         int left = 0 , right = n - 1, top = 0 , bottom = n - 1;
        
        
        while(left <= right && top <= bottom){
            
        for(int i = left; i <= right ; i++){
            arr[top][i] = counter++;
        }
        top++;
        
        for(int i = top; i <= bottom; i++){
            arr[i][right] = counter++;
        }
        right--;
        if(top <= bottom){
            
             for(int i = right; i>= left; i--){
                arr[bottom][i] = counter++;
            }
            bottom--;   
            }
        
       if(left <= right){
        for(int i = bottom; i >= top; i--){
            arr[i][left] = counter++;
        }
        left++;
            
        }
        }
        
        

        return arr;
    }
}