class Solution {
    int[] memo;

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        memo = new int[n];
        Arrays.fill(memo , -1);

        int first = helper(nums, 0, n - 2); // exclude last house
        Arrays.fill(memo , -1);
        int last = helper(nums, 1, n - 1); // exclude first house

        return Math.max(first, last);
    }

    public int helper(int[] nums, int index, int end) {
        if (index == end)
            return nums[index];

        if (index > end)
            return 0;

        if (memo[index] != -1)
            return memo[index];

        int pick = nums[index] + helper(nums, index + 2, end);
        int notpick = helper(nums, index + 1, end);

        memo[index] = Math.max(pick, notpick);

        return memo[index];
    }
}
