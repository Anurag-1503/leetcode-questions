class Solution {
    public int countGoodSubstrings(String s) {
        
        //edge case : if given string's length is less than 3 ,then its an invalid string
        if(s.length() < 3)
            return 0;
        
        int count = 0;
        
        
        //iterate from 0 to thirdlast char of string
        for(int i = 0 ; i < s.length() - 2 ; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            
            //check if all are distinct
            if(a!=b && b!=c && c!=a)
                count++;
        }
        
        return count;
        
    }
}