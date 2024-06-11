class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        //first find the minimum element of each row and store it in a separate list
        List<Integer> minimum = new ArrayList<>();
        
        for(int i = 0 ; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < matrix[0].length ; j++) {
                min = Math.min(min , matrix[i][j]);
            }
            minimum.add(min);
        }
        
        //Now find the Maximum element of each column and store it in a separate list
        List<Integer> maximum = new ArrayList<>();
        
        for(int j = 0 ; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < matrix.length ; i++) {
                max = Math.max(max , matrix[i][j]);
            }
            maximum.add(max);
        }
        
        //now find the common element in both these lists and add it in result list
        List<Integer> res = new ArrayList<>();
        for(int val1 : minimum) {
            for(int val2 : maximum) {
                if(val1 == val2) {
                    res.add(val1);
                }
            }
        }
        return res;
        
    }
}