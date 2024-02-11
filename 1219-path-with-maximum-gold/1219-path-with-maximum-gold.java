class Solution {
    int max = 0;

    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    travelAndCollectGold(i, j, grid, 0);
                }
            }
        }

        return max;
    }

    public void travelAndCollectGold(int i, int j, int[][] grid, int currentSum) {
        int m = grid.length;
        int n = grid[0].length;

        // Base case: if out of bounds or cell has no gold
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            max = Math.max(max, currentSum);
            return;
        }

        int originalValue = grid[i][j];

        // Mark the cell as visited
        grid[i][j] = 0;

        // Explore in four directions
        travelAndCollectGold(i - 1, j, grid, currentSum + originalValue); // north
        travelAndCollectGold(i, j + 1, grid, currentSum + originalValue); // east
        travelAndCollectGold(i, j - 1, grid, currentSum + originalValue); // west
        travelAndCollectGold(i + 1, j, grid, currentSum + originalValue); // south

        // Restore the original value before backtracking
        grid[i][j] = originalValue;
    }
}
