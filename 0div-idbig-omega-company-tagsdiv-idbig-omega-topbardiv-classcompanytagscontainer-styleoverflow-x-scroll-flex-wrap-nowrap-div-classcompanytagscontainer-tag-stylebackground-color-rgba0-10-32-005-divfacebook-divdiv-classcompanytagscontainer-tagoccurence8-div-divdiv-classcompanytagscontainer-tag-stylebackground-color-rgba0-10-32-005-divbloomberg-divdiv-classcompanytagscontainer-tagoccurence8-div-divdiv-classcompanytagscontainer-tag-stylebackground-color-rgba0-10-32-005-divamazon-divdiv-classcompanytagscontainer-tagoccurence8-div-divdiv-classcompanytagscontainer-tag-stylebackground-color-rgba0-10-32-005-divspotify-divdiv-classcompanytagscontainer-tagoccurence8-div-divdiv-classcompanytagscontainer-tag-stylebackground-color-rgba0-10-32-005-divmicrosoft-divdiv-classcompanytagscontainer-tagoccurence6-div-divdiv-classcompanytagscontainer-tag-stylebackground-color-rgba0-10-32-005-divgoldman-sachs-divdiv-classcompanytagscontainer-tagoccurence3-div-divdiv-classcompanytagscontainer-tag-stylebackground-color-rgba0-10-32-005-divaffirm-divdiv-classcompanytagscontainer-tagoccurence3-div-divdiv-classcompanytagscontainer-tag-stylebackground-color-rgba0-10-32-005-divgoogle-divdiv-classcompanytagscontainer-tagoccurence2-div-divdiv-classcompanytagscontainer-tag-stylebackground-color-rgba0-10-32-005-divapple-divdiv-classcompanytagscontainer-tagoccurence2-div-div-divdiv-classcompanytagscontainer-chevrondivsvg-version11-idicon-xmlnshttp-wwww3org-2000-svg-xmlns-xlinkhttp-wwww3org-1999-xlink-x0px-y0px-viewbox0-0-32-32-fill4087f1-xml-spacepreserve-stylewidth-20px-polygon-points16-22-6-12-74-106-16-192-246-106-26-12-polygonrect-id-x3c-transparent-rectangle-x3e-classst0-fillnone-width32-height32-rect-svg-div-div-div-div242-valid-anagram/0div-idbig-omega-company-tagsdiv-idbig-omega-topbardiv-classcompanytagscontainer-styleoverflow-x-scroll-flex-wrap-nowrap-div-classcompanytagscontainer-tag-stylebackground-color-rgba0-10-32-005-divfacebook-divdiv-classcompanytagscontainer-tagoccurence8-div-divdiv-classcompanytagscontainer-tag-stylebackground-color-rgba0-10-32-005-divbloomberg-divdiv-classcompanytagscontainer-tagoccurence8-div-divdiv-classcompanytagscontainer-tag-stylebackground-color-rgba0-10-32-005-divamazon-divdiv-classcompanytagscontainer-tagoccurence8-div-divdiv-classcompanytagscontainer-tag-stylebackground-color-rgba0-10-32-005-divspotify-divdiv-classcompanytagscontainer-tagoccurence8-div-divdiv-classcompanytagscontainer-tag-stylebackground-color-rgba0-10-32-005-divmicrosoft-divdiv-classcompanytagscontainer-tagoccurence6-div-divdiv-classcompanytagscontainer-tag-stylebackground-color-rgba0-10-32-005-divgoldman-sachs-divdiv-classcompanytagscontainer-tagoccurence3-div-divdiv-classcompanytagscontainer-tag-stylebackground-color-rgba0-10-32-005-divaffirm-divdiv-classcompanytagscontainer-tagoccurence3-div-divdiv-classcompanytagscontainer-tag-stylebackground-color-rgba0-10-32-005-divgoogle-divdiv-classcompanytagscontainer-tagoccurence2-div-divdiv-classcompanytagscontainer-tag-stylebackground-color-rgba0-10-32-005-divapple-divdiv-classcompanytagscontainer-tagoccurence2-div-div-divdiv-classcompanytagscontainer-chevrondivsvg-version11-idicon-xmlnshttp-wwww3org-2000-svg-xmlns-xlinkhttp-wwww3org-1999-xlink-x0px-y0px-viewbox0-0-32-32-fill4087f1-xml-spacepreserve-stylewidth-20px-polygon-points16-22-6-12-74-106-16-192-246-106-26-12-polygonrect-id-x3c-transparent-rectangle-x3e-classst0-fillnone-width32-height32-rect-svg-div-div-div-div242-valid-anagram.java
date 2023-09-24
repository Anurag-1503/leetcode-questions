class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char ch1 : s.toCharArray()){
            map.put(ch1 , map.getOrDefault(ch1, 0) + 1);
        }
        for(char ch2 : t.toCharArray()){
            map.put(ch2 , map.getOrDefault(ch2, 0) - 1);
        }
        
        for(int value : map.values()){
            if(value != 0)
                return false;
        }
        return true;
    }
}