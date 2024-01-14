class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n = num.length;
        List<Integer> ans =  new ArrayList<>();
        
        for(int i = n - 1 ; i >= 0 ; i--){
            ans.add(0,(num[i]+k)%10);
            k = (num[i] + k) / 10;
        }
        
        while(k > 0){
            ans.add(0,k%10);
            k /= 10;
        }
        return ans;
    }
}