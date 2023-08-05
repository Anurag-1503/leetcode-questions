class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int[] altitude = new int[n+1];
        Arrays.fill(altitude,0);
        for(int i = 0; i < n; i++){
            altitude[i+1] = altitude[i] + gain[i];
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < altitude.length; i++){
            if(max < altitude[i])
                max = altitude[i];
        }
        return max;
    }
}