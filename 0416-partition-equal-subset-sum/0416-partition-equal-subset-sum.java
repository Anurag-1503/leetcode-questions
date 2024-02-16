class Solution {
    Boolean[][] memo;

    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int val : nums)
            totalSum += val;

        if (totalSum % 2 != 0) return false;

        int targetSum = totalSum / 2;
        memo = new Boolean[nums.length][targetSum + 1];

        return helper(0, nums, targetSum);
    }

    public boolean helper(int index, int[] nums, int targetSum) {
        if (index >= nums.length)
            return false;

        if (nums[index] == targetSum)
            return true;

        if (memo[index][targetSum] != null)
            return memo[index][targetSum];

        else if (nums[index] > targetSum)
            return memo[index][targetSum] = helper(index + 1, nums, targetSum);

        boolean include = helper(index + 1, nums, targetSum - nums[index]);
        boolean exclude = helper(index + 1, nums, targetSum);
        
        return memo[index][targetSum] = (include || exclude);
    }
}
