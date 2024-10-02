class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        //first find minimum element from each row
        
        List<Integer> min_arr = new ArrayList<>();
        for(int i = 0 ; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < matrix[i].length ; j++) {
                min = Math.min(min , matrix[i][j]);
            }
            min_arr.add(min);
        }
        
        List<Integer> max_arr = new ArrayList<>();
        for(int i = 0 ; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < matrix.length ; j++) {
                max = Math.max(max , matrix[j][i]);
            }
            max_arr.add(max);
        }
        
        List<Integer> res_arr = new ArrayList<>();
        for(int val1 : min_arr){
            for(int val2 : max_arr){
                if(val1 == val2)
                    res_arr.add(val1);
            }
        }
        
        return res_arr;
        
    }
}