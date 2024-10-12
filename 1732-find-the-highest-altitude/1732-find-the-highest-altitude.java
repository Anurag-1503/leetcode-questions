class Solution {
    public int largestAltitude(int[] gain) {
        
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        int sum = 0;
        for(int i = 0 ; i < gain.length ; i++) {
            sum += gain[i];
            ans.add(sum);
        }
        
        int max = Integer.MIN_VALUE;
        for(int val : ans) {
            max = Math.max(max , val);
        }
        
        return max;
        
    }
}