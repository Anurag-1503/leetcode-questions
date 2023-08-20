class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] ch = s.split(" ");
        int last_ele_size = ch[ch.length - 1].length();
        return last_ele_size;
    }
}