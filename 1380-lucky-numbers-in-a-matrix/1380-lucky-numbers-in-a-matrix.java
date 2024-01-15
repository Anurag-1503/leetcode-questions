class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        // Find the minimum element from each row and put them in a list
        List<Integer> min = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minimum = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }
            }
            min.add(minimum);
        }
        
        // Find the maximum elements from each column and put them in a list
        List<Integer> max = new ArrayList<>();
        for (int j = 0; j < matrix[0].length; j++) {
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > maximum) {  // Fix: Corrected index to matrix[i][j]
                    maximum = matrix[i][j];
                }
            }
            max.add(maximum);
        }
        
        // Find the common elements and put them in a separate list
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < min.size(); i++) {
            for (int j = 0; j < max.size(); j++) {
                if (min.get(i).equals(max.get(j))) {
                    result.add(min.get(i));
                }
            }
        }
        
        return result;
    }
}
