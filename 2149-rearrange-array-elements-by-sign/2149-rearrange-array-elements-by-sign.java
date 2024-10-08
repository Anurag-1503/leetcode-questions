class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        
        //create two separate lists to store positive and negative elements from original array
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int val : nums) {
            if(val >= 0)
                pos.add(val);
            else
                neg.add(val);
        }
        
        //now Interleave +ve and -ve elements
        //count is for keeping index in mind for res list , i and j acts as index pointers for pos and neg lists
        //first element must be +ve 
        int count = 0 , i = 0 , j = 0;
        for(int num : nums ) {
            if(count % 2 == 0)
                res.add(pos.get(i++));
            else
                res.add(neg.get(j++));
            
            count++;
        }
        
        //convert res to array
        
        int[] output = new int[n];
        for(int k = 0 ; k < n ; k++) {
            output[k] = res.get(k);
        }
        
        return output;
        
    }
}