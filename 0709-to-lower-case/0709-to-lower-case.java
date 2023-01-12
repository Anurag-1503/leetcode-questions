class Solution {
    public String toLowerCase(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                s1.append((char)(s.charAt(i)+32));
            }
            else
            {
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}