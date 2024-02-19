class Solution {
    
    int memo[][];
    
    public int longestStrChain(String[] words) {
    
        int prev = -1;
        //sort the array on the basis of length of each element
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        memo = new int[words.length][words.length];
        for(int[] row : memo)
            Arrays.fill(row , -1);
        
        return helper(0,prev,words);
    }
    
    public int helper(int index , int prev , String[] words) {
        
        //base condition
        if(index >= words.length)
        {
            return 0;
        }
        
        if(prev != -1 && memo[index][prev] != -1)
            return memo[index][prev];
        
        
        int take = 0 ;
        if(prev == -1 || isPredecessor(words[prev], words[index])) 
            take = 1 + helper(index+1,index,words);
        
        int skip = 0 + helper(index+1,prev,words);
        
        
        if(prev != -1)
            memo[index][prev] = Math.max(take , skip);
        
        return Math.max(take , skip);
         
    }
    
    public boolean isPredecessor(String word1, String word2) {
       
        int M = word1.length();
        int N = word2.length();
        
        if( M >= N || N-M != 1)
            return false;
        
        int i = 0 , j = 0;
        
        while(i < M && j < N) {
            if(word1.charAt(i) == word2.charAt(j))
                i++;
            j++;
        }

        return i == M;
    }
}