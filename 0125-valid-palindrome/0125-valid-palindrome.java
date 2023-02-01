class Solution {
    public boolean isPalindrome(String s) {
     
   
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)))
              {
               if (s.charAt(i)==s.charAt(j))
                  {
                      i++;
                      j--;
                  }
                  
           else  {
                return false;
                }
        } 
        if(!Character.isLetterOrDigit(s.charAt(i)))i++;
        if(!Character.isLetterOrDigit(s.charAt(j)))j--;
            
            
           
        }
        return true;
    }
}