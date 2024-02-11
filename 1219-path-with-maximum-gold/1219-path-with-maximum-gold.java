class Solution{
    
    public int getMaximumGold(int[][] grid) {
    
    int maxGold = 0;
    
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] != 0) {
                maxGold = Math.max(maxGold, helper(grid, i, j));
            }
        }
    }
    return maxGold;
}

private int helper(int[][] grid, int x, int y) {
    //if out of bounds or no gold , return
    if (x < 0 || grid.length - 1 < x || y < 0 || grid[0].length - 1 < y || grid[x][y] == 0) {
        return 0;
    }
    //store copy of current position's gold
    int temp = grid[x][y];
    
    //make the current position 0 to make sure its visited
    grid[x][y] = 0;
    //travel in all directions
    int up = helper(grid, x - 1, y);
    int down = helper(grid, x + 1, y);
    int left = helper(grid, x, y - 1);
    int right = helper(grid, x, y + 1);
    
    //restore the original gold to current index(backtracking)
    grid[x][y] = temp;
    
    //return the one maximum value of gold from all directions
    return Math.max(Math.max(Math.max(left, right), up), down) + temp;
}

    
}
