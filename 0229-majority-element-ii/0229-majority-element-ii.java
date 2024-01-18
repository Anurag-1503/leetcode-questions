class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
         List<Integer> result = new ArrayList<>();

        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        // Voting process to find potential majority elements
        for (int num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Reset counts for the second pass
        count1 = 0;
        count2 = 0;

        // Count occurrences of potential majority elements
        for (int num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            }
        }

        // Check if potential majority elements meet the condition and add to result
        if (count1 > nums.length / 3) {
            result.add(element1);
        }
        if (count2 > nums.length / 3) {
            result.add(element2);
        }

        return result;
        
        
        
        
    }
}