class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int n = s.length();
        int start = 0;
        int maxLength = 0;
        int currCost = 0;
        
        for(int end = 0 ; end < n ; end++) {
            
            char a = s.charAt(end);
            char b = t.charAt(end);
            
            currCost += Math.abs(a-b);
            
            while(currCost > maxCost) {
                currCost = currCost - Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            
            maxLength = Math.max(maxLength , end - start + 1);
        }
        
        return maxLength;
        
    }
}