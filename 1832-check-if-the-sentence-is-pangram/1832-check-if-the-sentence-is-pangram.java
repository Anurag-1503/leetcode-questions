class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();
        int[] table = new int[26];
        Arrays.fill(table,0);
        
        for(int i = 0; i < n ; i++){
            table[sentence.charAt(i) - 97] = 1;
        }
        
        for(int i = 0; i < 26 ; i++){
            if(table[i]==0)
                return false;
        }
        return true;
    }
}