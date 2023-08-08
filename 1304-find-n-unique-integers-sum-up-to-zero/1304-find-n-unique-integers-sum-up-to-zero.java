class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int start = 0;
        int end = n-1;
        int temp = n/2;
        
        while(start<=end){
            result[start] = -temp;
            result[end] = temp;
            temp--;
            start++;
            end--;
        }
        return result;
    }
}