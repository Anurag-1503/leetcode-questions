//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isLeap(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isLeap(int N){
        //if year is divisible by 4
        if(N%4 == 0){
             //if year is century year
            if(N%100 == 0)
            {
                 //if century year is divided by 400, it is leap year
                if(N%400 == 0)
                    return 1;
                //if century year is not divided by 400, it is not leap year
                else
                    return 0;
            }
            //if year is not a century year, it is leap year
            else
                return 1;
                
        }
        //if year is not divided by 4, it cant be a leap year
        else
            return 0;
    }
}