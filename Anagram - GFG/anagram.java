//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
  
    public static boolean isAnagram(String a,String b)
    {
        
       
    if (a.length() != b.length()) {
        return false;  // Anagrams must have the same length
    }

    StringBuilder str1 = new StringBuilder(a);
    StringBuilder str2 = new StringBuilder(b);

    char[] charArray1 = str1.toString().toCharArray();
    char[] charArray2 = str2.toString().toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);


    }
}