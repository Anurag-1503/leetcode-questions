class Solution {
    public int maxRepeating(String sequence, String word) {
        String res="";
        while(sequence.contains(res))
            res+=word;
        return (res.length()-word.length())/word.length();
        
    }
}