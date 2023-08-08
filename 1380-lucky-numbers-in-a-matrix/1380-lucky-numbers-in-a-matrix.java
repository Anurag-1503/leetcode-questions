class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] minRows = new int[matrix.length];
        int[] maxCols = new int[matrix[0].length];
        
        // Find minimum elements in each row
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minRows[i] = min;
        }
        
        // Find maximum elements in each column
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxCols[j] = max;
        }
        
        // Find the lucky numbers
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == minRows[i] && matrix[i][j] == maxCols[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        
        return luckyNumbers;
        
        
    }
}