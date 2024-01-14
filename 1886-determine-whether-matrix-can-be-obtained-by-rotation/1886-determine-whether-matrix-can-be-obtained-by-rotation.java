class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        rotateClockwise(mat);
        if(Arrays.deepEquals(mat,target))
            return true;
        
        rotateClockwise(mat);
        if(Arrays.deepEquals(mat,target))
            return true;
        
        rotateClockwise(mat);
        if(Arrays.deepEquals(mat,target))
            return true;
        
        rotateClockwise(mat);
        return Arrays.deepEquals(mat,target);
        
    }
    
    
    public void rotateClockwise(int[][] mat){
        Transpose(mat);
        reverseCols(mat);
    }
    
    
    
    public void Transpose(int[][] mat){

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = i ; j < mat[0].length ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    
    public void reverseCols(int[][] mat){
        
         for(int i = 0 ; i < mat.length ; i++){
             int leftIndex = 0;
             int rightIndex = mat[i].length - 1;
             
             while(leftIndex < rightIndex){
                 int temp = mat[i][leftIndex];
                 mat[i][leftIndex] = mat[i][rightIndex];
                 mat[i][rightIndex] = temp;
                 leftIndex++;
                 rightIndex--;
             }
         }
    }
    
}