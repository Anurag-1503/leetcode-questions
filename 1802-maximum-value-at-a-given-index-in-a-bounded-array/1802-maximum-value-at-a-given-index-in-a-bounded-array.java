class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long start = 1;
        long end = maxSum;
        long mid_val = 0;
        int result = 0;
        
        while(start <= end){
            mid_val = start + (end - start)/2;
            
            //-----------Calculation of left sum------------------
            long left_count = Math.min((long)index , mid_val - 1);
            long leftSum = getSumByFormula(left_count , mid_val);
            leftSum += Math.max((long)0 , index - (mid_val - 1));//extra 1's if any
            
            //-----------Calculation of right sum------------------
            long right_count = Math.min((long)n - index - 1 , mid_val - 1);
            long rightSum = getSumByFormula(right_count , mid_val);
            rightSum += Math.max((long)0 , n - index - 1 - (mid_val - 1));//extra 1's if any
            
            //--------Evaluation of Total sum----------------------
            long totalSum = leftSum + mid_val + rightSum;
            if(totalSum <= maxSum)
            {
                result = Math.max(result , (int)mid_val);
                start = mid_val + 1;
            }
            else
            {
                end = mid_val - 1;
            }
            
        }
        return result;
    }

    
    public long getSumByFormula(long count , long x){
        
        return (count*x) - (count*(count+1))/2;
    }
}