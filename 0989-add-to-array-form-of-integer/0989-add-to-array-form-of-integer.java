class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        List<Integer> res = new ArrayList<>();

        for(int i = n - 1; i >= 0 || k > 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            if (k > 0) {
                carry += k % 10;
                k /= 10;
            }
            res.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(res);
        return res;
    }
}
