class Solution {
    int[][] memo;
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int rows = triangle.size();
        
        memo = new int[rows][rows];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return helper(0,0,rows-1,triangle);
        
    }
    
    public int helper(int i , int j , int rows , List<List<Integer>> triangle){
        
        if(i == rows)
            return triangle.get(rows).get(j);
        
        //we can only move diagnol-right and downwards so there wont be any out-of-bound condition for j
        
        
        if(memo[i][j] != -1)
            return memo[i][j];
        
        int down = triangle.get(i).get(j) + helper(i+1,j,rows,triangle);
        int downRight = triangle.get(i).get(j) + helper(i+1,j+1,rows,triangle);
        
        return memo[i][j] = Math.min(down , downRight);
    }
}