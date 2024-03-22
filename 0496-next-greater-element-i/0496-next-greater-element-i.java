class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // we will need a stack and a hashmap
        //hashmap to store the elements with their next greater element in nums2 array
        
        Map<Integer , Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int val : nums2) {
            while(!st.isEmpty() && st.peek() < val)
                map.put(st.pop() , val);
            
            st.push(val);
        }
        
        for(int i = 0 ; i < nums1.length ; i++) {
            nums1[i] = map.getOrDefault(nums1[i] , -1);
        }
        
        return nums1;
        
    }
}