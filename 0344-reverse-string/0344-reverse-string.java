class Solution {            
    static char[] swap(char[] s, int a,int b ){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
        return s;
    }
    void fun(char[] s, int low, int high){
        if(high-low+1<=1) return;
        swap(s, low, high);
        fun(s, low+1, high-1);
    }
    public void reverseString(char[] s) {
        fun(s, 0, s.length-1);
        
    }
}