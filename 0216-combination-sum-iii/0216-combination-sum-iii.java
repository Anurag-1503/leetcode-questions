class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(1, k, n, res, ds, 9); // Start from 1 instead of 0
        return res;
    }

    public void backtrack(int i, int max, int target, List<List<Integer>> res, List<Integer> ds, int end) {
        if (max == 0 && target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int j = i; j <= end; j++) {
            // Inclusion
            if (target >= j) {
                ds.add(j);
                backtrack(j + 1, max - 1, target - j, res, ds, end);
                ds.remove(ds.size() - 1);
            }
        }
    }
}