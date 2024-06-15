class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
       List<Integer> res = new ArrayList<>();

        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Find the minimum element in the current row and its column index
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            // Check if the found minimum element is the maximum in its column
            boolean isMaxInColumn = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > min) {
                    isMaxInColumn = false;
                    break;
                }
            }

            // If the minimum element in the row is also the maximum in its column, it's a lucky number
            if (isMaxInColumn) {
                res.add(min);
            }
        }

        return res;
        
    }
}