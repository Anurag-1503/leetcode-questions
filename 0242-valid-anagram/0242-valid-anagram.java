class Solution {
    public boolean isAnagram(String s, String t) {
        
         
        //O(n)
        
        //Increment the count for each character in s.
        //Decrement the count for each character in t.
        //Check if all counts are zero:
        //If all counts are zero after processing both strings, then s and t are anagrams.
        
         if(s.length() != t.length())
            return false;
            
        int[] table = new int[26];
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }
        
        //now check if every element is 0 , if no then it was an anagram(i.e. return false)
        for(int val : table){
            if(val != 0)
                return false;
        }
        
        return true;
        
    }
}