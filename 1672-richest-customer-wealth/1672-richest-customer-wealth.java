class Solution {
    public int maximumWealth(int[][] accounts) {
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < accounts.length; i++){
            int count = 0;
            for(int j = 0 ; j < accounts[0].length ; j++){
                
                count += accounts[i][j];
            }
            
            arr.add(count);
        }
        
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}