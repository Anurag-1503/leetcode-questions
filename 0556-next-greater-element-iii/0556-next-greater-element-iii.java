class Solution {
    public int nextGreaterElement(int n) {
         //converting to char Array
        char arr[] = (Integer.toString(n)).toCharArray();
       
        //finding the first drop in sequence from right to left
        int i=arr.length-2;
        StringBuilder ans = new StringBuilder();
        while(i>=0 && arr[i] >= arr[i+1])
            i--;
        
        if(i == -1)
            return -1;
        
        
        //finding the element which is just greater than the ith indexed-element
        int k = arr.length-1;
        while(arr[k] <= arr[i])
            k--;
        
        //swap function to swap elements(array,ith indexed-element,kth indexed element)
        swap(arr,i,k);
        
        //appending string from 0index to ith index
        for(int j=0;j<=i;j++)
            ans.append(arr[j]);
        
        //appending reversed string from last index to i+1 index
        for(int j=arr.length-1;j>i;j--)
            ans.append(arr[j]);
        
        long res = Long.parseLong(ans.toString());
        
        //returning ans if it is valid and fits in 32-bit integer else return -1
        return (res > Integer.MAX_VALUE) ? -1 : (int)res;
        
        
    }
    //swap function
    void swap(char[] arr,int i,int j)
    {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        
        
    }
}