class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        
        //to calculate the overall product of array
        int max_product = 1;
        for(int var : nums)
            max_product *= var;
        
        //to calculate the overall product of array except zero elements
        int max_product_wz = 1;
        for(int var : nums){
            if(var != 0)
               max_product_wz *= var;
        }
        
        //to calculate the number of zeroes
        int count = 0;
        for(int var : nums){
            if(var == 0)
                count++;
        }
        
        for(int i = 0 ; i < n ; i++) {
            //if the curr element is nonzero 
            if(nums[i] != 0) {
                //check if there exists a zero in array , if yes then store 0
                if(count > 0)
                    ans[i] = 0;
                //if not then divide
                else
                    ans[i] = max_product_wz/nums[i];
            }
            else {
                //if curr element is zero
                //check if there exists another zero in array except curr , if yes then store 0
                if(count > 1)
                    ans[i] = 0;
                //if not then store the max product without zero
                else
                    ans[i] = max_product_wz;  
            }
        }
        
        
        
        return ans;
    }
}