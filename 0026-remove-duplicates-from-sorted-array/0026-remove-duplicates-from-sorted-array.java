class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
         
        if (n <= 1) {
        return n; // No duplicates to remove
    }
    
    int i = 0; // Pointer for the current unique element
    for (int j = 1; j < n; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j]; // Move the unique element to the next position
        }
    }
    
    return i + 1; // The count of unique elements is i + 1
    }
}