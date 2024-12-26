class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        
        int[] p_hash = new int[26];
        int[] s_hash = new int[26];
        
        
        //simply not possible for s to have anagram of p , if s string size is smaller than p
        if(p.length() > s.length())
            return res;
        
        //record the freq. if p string's characters
        for(char curr : p.toCharArray()) {
            p_hash[curr - 'a']++;
        }
        
        //now we initialize our first window of p.length()
        for(int i = 0 ; i < p.length() ; i++) {
            s_hash[s.charAt(i) - 'a']++;
        }
        
        //now we check freq. match for all p.length()'s sized window in s string to that of p string's chars freq
        for(int i = 0 ; i <= s.length() - p.length() ; i++) {
            
            if(Arrays.equals(p_hash , s_hash))
                res.add(i);
            
            //if freq. not matched , then slide the window forward by one char , also keep boundary in mind
            if(i < s.length() - p.length()) {
                s_hash[s.charAt(i) - 'a']--;
                s_hash[s.charAt(i + p.length()) - 'a']++;
            }
        }
        
        return res;
        
    }
}