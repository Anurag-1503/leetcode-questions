class Solution {
    public int countAsterisks(String s) {
        boolean found=false;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*' && found==false)
                count++;
            if(s.charAt(i)=='|')
                found=!found;
        }
        return count;
        
    }
}