class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < accounts.length ; i++){
            int counts = 0;
            for(int j = 0; j < accounts[0].length; j++){
                counts += accounts[i][j];
            }
            max = Math.max(max,counts);
            
        }
    
        return max;
    }
}