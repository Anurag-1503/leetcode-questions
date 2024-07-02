class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(1 , k , n , ds , res , 9);
        return res;
    }
    
    public void helper(int start , int max , int n ,List<Integer> ds ,  List<List<Integer>> res , int end) {
        
        if(max == 0 && n == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = start ; i <= end ; i++) {
            if(n >= i) {
                ds.add(i);
                helper(i + 1 , max - 1 , n - i , ds , res, end);
                ds.remove(ds.size()-1);
            }
        }
        
    }
}