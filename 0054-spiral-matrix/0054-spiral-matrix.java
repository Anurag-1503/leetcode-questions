class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int left = 0 , right = cols - 1, top = 0 , bottom = rows - 1;
        
        
        while(left <= right && top <= bottom){
            
        for(int i = left; i <= right ; i++){
            arr.add(matrix[top][i]);
        }
        top++;
        
        for(int i = top; i <= bottom; i++){
            arr.add(matrix[i][right]);
        }
        right--;
        if(top <= bottom){
            
             for(int i = right; i>= left; i--){
                arr.add(matrix[bottom][i]);
            }
            bottom--;   
            }
        
       if(left <= right){
        for(int i = bottom; i >= top; i--){
            arr.add(matrix[i][left]);
        }
        left++;
            
        }
        }
        
        
        return arr;
        
    }
}