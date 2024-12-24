class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        //left shift the binary bits of 1 "k times"
        int required = 1 << k;
        
        //using set here cuz to avoid duplicacy of substrings
        Set<String> seen = new HashSet<>();
         
        //slide through the string with a window size of k
        for(int i = 0 ; i <= s.length() - k ; i++) {
            String a = s.substring(i , i+k);
            seen.add(a);
            
            //exit early if we have all the possible binary codes in set
            if(seen.size() == required)
                return true;  
        }
        
        //atlast, check if the condition is met or not
        return seen.size() == required;
    }
}