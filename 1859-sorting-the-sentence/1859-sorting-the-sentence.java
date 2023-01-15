class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String temp[]= new String[arr.length];
        String res="";
        
        for(int i=0; i<arr.length; i++)
        {
            int index=arr[i].charAt(arr[i].length()-1)-'0'; //subtracted zero to convert the to integer data type
            temp[index-1]=arr[i].substring(0,arr[i].length()-1);
        }
        for(int i=0; i<temp.length; i++)
        {
            res+=temp[i];
            res+=" "; //to add 1 space after each word from temp String Array 
        }
        return res.trim();//to remove extra space after last word (not needed in res)
        
    }
}