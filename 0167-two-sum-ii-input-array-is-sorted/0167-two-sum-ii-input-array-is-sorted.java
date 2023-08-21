class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for(int i = 0; i < numbers.length ; i++){
            int complement = target - numbers[i];
            int index = binarySearch(numbers, complement , i+1);
            if(index != -1)
                return new int[]{i+1,index+1};
            
        }
        return new int[]{-1,-1};
    }
    
    public int binarySearch(int[] numbers, int target, int index){
        int start = index;
        int end = numbers.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(numbers[mid] == target)
                return mid;
            else if(numbers[mid] > target){
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return -1;
        
    }
}