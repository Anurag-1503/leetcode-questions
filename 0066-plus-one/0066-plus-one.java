class Solution {
    public int[] plusOne(int[] digits) {
        
        List<Integer> ans = new ArrayList<>();
        int k = 1;
        int n = digits.length;
        for(int i = n-1 ; i >= 0 ; i--){
            ans.add(0,(digits[i]+k)%10);
            k = (digits[i] + k)/10;
        }
        
        while(k > 0){
            ans.add(0,k%10);
            k /= 10;
        }
        
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        
        return res;
        
    }
}