class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return findPair(numbers, target, 0, numbers.length - 1);
        
    }
    
        private int[] findPair(int[] numbers, int target, int left, int right) {
        if (left >= right) {
            return null; // No solution found
        }
        
        int sum = numbers[left] + numbers[right];
        if (sum == target) {
            return new int[]{left + 1, right + 1}; 
        } else if (sum < target) {
            return findPair(numbers, target, left + 1, right);
        } else {
            return findPair(numbers, target, left, right - 1);
        }
    }
}