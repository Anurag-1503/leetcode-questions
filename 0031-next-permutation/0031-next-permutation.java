class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Find the breakpoint where nums[i] < nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If breakpoint doesn't exist, it means the array is in reverse-sorted order
        // and the next permutation of it is the reverse of itself
        if (index == -1) {
            reverse(0, n - 1, nums);
            return;
        }

        // Find the smallest element greater than nums[index]
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[index]) {
                // Swap the elements
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                // Break after the swap
                break;
            }
        }

        // Sort the rest of the elements from index+1 to end
        reverse(index + 1, n - 1, nums);
    }

    public void reverse(int i, int j, int[] nums) {
        int start = i;
        int end = j;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
