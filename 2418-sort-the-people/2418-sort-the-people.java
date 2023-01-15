class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        String[] result=new String[names.length];
        
        for( int i=0 ;i<names.length; i++)
        {
            int maxHeight = Integer.MIN_VALUE;
            for(int j : heights )
            {
                maxHeight = Math.max(maxHeight,j);
            }
            for(int j=0 ;j<names.length; j++)
            {
                if(heights [j]==maxHeight)
                {
                    heights [j]=-1;
                    result[i]=names[j];
                    break;
                }
            }
        }
        return result;
    }
}