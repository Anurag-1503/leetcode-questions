class Solution {
    public boolean canTransform(String start, String end) {
        int i=0,j=0;
		int n=start.length();
		String s1=start.replace("X","");
		String s2=end.replace("X","");
		if(s1.compareTo(s2)!=0)
            return false;
		while(i<n && j<n)
		{
			if(start.charAt(i)=='X') i++;
			else if (end.charAt(j)=='X')j++;
			else
			{
				if((start.charAt(i)=='L' && i<j) || (start.charAt(i)=='R' && i>j)) 
                    return false;
				i++;
				j++;
			}
		}
		return true;
        
        
    }
}