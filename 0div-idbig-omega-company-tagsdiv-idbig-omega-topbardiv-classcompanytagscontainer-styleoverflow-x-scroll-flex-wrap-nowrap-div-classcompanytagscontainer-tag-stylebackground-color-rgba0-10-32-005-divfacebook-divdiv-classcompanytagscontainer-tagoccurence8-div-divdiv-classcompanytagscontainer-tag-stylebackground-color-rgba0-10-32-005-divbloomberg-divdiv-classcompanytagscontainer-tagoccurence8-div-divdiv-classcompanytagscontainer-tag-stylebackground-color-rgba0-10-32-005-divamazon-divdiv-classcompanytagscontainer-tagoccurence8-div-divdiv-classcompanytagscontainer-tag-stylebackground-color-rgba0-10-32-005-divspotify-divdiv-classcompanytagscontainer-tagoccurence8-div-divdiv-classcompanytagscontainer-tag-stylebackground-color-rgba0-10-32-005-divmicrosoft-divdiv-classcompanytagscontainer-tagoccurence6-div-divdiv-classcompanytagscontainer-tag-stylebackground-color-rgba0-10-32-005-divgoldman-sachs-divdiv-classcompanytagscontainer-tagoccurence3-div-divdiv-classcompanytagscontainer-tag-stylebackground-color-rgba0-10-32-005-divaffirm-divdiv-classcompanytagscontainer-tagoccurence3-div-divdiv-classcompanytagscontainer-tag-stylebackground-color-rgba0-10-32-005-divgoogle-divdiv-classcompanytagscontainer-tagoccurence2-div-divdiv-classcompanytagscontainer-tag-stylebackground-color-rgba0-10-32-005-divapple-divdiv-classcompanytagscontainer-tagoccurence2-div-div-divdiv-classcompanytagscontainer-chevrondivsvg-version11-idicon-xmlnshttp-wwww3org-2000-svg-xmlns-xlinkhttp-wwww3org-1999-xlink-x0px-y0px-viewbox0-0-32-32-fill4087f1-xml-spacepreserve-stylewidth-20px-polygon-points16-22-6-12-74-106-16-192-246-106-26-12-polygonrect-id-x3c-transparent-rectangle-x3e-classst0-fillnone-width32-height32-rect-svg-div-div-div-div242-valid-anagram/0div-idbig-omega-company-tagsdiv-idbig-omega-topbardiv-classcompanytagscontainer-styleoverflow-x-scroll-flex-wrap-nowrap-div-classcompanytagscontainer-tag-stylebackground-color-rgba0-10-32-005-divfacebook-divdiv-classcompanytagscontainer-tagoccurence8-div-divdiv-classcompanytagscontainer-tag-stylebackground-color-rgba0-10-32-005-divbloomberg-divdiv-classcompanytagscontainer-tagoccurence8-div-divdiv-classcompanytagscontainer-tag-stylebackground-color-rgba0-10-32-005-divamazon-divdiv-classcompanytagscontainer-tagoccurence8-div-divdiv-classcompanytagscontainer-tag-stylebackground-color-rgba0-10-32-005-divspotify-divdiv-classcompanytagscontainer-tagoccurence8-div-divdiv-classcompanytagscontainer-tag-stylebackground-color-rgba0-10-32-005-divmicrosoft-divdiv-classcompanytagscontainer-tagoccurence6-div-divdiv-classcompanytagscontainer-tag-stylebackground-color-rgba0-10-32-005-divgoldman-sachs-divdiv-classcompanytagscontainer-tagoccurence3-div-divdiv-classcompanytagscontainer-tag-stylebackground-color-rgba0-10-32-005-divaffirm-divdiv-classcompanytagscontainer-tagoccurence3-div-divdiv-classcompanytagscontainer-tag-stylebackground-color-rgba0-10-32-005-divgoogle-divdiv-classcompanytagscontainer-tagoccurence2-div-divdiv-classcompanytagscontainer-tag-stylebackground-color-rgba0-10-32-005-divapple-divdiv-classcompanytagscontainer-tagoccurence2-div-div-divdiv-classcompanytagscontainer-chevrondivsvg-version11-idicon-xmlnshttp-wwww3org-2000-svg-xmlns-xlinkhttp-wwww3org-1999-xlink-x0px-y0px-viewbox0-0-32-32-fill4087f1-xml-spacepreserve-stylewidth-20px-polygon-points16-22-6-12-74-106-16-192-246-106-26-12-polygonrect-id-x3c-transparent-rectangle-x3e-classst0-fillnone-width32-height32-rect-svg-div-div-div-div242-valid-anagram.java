class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = sb.indexOf(String.valueOf(currentChar));

            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false; // If the character in s is not found in sb, return false
            }
        }

        return true; // If all characters in s are found and deleted from sb, it's an anagram
    }
}