class Solution {
    
    int memo[][];
    public int minimumTotal(List<List<Integer>> triangle) {
    
        
        memo = new int[triangle.size()][triangle.size()];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        return helper(0,0,triangle);
        
    }
    
    public int helper(int i , int j , List<List<Integer>> triangle) {
        
        
        if(i >= triangle.size())
            return 0;
        
        if(i == triangle.size() -1)
            return triangle.get(i).get(j);
        
        if(memo[i][j] != -1)
            return memo[i][j];
        
        int down = helper(i+1,j,triangle);
        int diagnol = helper(i+1,j+1,triangle);
        
        return memo[i][j] = triangle.get(i).get(j) + Math.min(down , diagnol);
        
        
        
    }
}