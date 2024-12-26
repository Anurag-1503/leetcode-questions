class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int start = 0;
        
        for(int end = 0 ; end < s.length() ; end++) {
            
            char curr = s.charAt(end);
            
            //now check if curr character is already present in the set or not ,if yes then skip it
            while(set.contains(curr)) {
                set.remove(s.charAt(start));
                start++;
            }
            
            set.add(curr);
            
            maxLength = Math.max(maxLength , (end - start) + 1 );
        }
        
        return maxLength;
        
    }
}