class Solution {
    public int largestAltitude(int[] gain) {
       int mx=0,current=0;
        for(int i=0; i<gain.length;i++){
            current += gain[i];
            mx=Math.max(mx,current);
        }
        return mx;
    }
}