class Solution {
    public String reversePrefix(String word, char ch) {
		int i=0;
		StringBuilder s=new StringBuilder();
		StringBuilder s1=new StringBuilder();

		if(word.indexOf(ch)>-1)
		{
			
			while(i<=word.indexOf(ch))
			{
				s.append(word.charAt(i));
				i++;
			}
		
			for(int j=word.indexOf(ch);i<word.length();i++)
			{
				s1.append(word.charAt(i));
			}
		
			
			s=s.reverse();
			String myString = String.join("",s,s1);
			
			return myString;
		}
		
		return word;
    }
}