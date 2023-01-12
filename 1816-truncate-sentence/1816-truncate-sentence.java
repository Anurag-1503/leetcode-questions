class Solution {
    public String truncateSentence(String s, int k) {
        
        int n=s.length();
        int count=0;
       
        for( int i=0; i<n;i++)
        {
            
            if(s.charAt(i)==' ')
            {
                count++;
                if(count==k)
                  return s.substring(0,i);
            }
        }
         
        return s;
    }
}