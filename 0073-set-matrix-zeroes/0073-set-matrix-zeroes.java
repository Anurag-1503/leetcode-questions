class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i = 0 ; i < row.size() ; i++){
            for(int j = 0 ; j < c; j++){
                matrix[row.get(i)][j] = 0;
            }
        }
        
        for(int i = 0 ; i < col.size() ; i++){
            for(int j = 0 ; j < r; j++){
                matrix[j][col.get(i)] = 0;
            }
        }
        
    }
}