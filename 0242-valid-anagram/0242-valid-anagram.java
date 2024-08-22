class Solution {
    public boolean isAnagram(String s, String t) {
        
        //in this approach we can make a new StringBuilder same as Strint t, and compare it with s
        //for each character , if found in both , then delete from StringBuilder , else return false;
        if(s.length() != t.length())
            return false;
            
        StringBuilder sb = new StringBuilder(t);
        for(int i = 0 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            int index = sb.indexOf(String.valueOf(curr)); //finds the index of current char of s in sb
            
            //if not found , return false;
            //if found , then delete that matched char from sb
            if(index == -1)
                return false;
            else
                sb.deleteCharAt(index);
        }
       
       return true;
        
    }
}