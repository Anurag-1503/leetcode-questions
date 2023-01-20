class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,l=0;
        for(int i=0; i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
                u++;
            if(moves.charAt(i)=='D')
                u--;
            if(moves.charAt(i)=='L')
                l++;
            if(moves.charAt(i)=='R')
                l--;
            
        }
        return l==0 && u==0;
    }
}