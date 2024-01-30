class Solution {
    public int splitArray(int[] nums, int k) {
        
        int start = FindMax(nums);
        int end = ArraySum(nums);
        
        int result = 0;
        
        while(start <= end){
            
            int mid = start +(end - start)/2;
            
            int Students = findReq_students(nums , mid);
            
            if(Students > k)
               start = mid + 1;
            else
               end = mid - 1;
        }
        
        return start;
        
    }
    
    
    public static int FindMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr)
            max = Math.max(max, num);

        return max;
    }
    
    

    public static int ArraySum(int[] arr) {
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        return totalSum;
    }
    
    

    public static int findReq_students(int[] arr, int pages) {
        int curr_pages = 0;
        int students = 1;

        for (int i = 0; i < arr.length; i++) {
            if (curr_pages + arr[i] <= pages)
                curr_pages += arr[i];
            else {
                students++;
                curr_pages = arr[i];
            }
        }

        return students;
    }
}