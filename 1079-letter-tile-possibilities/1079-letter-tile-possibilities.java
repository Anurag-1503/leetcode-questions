class Solution {
    int count = 0;
    public int numTilePossibilities(String tiles) {
        
        boolean visited[] = new boolean[tiles.length()];
        char arr[] = tiles.toCharArray();
        Arrays.sort(arr);
        helper(arr, visited);
        return count-1; //-1 to remove the empty sequence
        
    }
    
    public void helper(char[] arr , boolean[] visited) {
        count++;
        
        for(int i = 0; i < arr.length ; i++) {
            
            if( (i>0 && arr[i] == arr[i-1] && !visited[i-1]) || visited[i] )
                continue;
            
            visited[i] = true;
            helper(arr,visited);
            visited[i] = false;
        }
    }
}