class Solution {
    public int countArrangement(int n) {
        // Initialize the count of beautiful arrangements
        int[] count = new int[1];
        
        // Create an array to track which numbers have been used in the permutation
        boolean[] used = new boolean[n + 1];
        
        // Start the backtracking process from position 1
        backtrack(n, 1, used, count);
        
        // Return the total count of beautiful arrangements
        return count[0];
    }
    
    private void backtrack(int n, int pos, boolean[] used, int[] count) {
        // If we've reached the end of the permutation, increment the count
        if (pos > n) {
            count[0]++;
            return;
        }
        
        // Try placing each number from 1 to n at the current position
        for (int i = 1; i <= n; i++) {
            // Check if the number i can be placed at position pos
            if (!used[i] && (i % pos == 0 || pos % i == 0)) {
                // Mark the number i as used
                used[i] = true;
                
                // Recurse to place the next number
                backtrack(n, pos + 1, used, count);
                
                // Unmark the number i to backtrack
                used[i] = false;
            }
        }
    }
}
