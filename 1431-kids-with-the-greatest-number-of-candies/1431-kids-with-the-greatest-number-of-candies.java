class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<Boolean>(n);
    
        int maxcandy=0;
        for(int i =0; i< n; i++)
           {
            if(candies[i]> maxcandy)
            {
                maxcandy=candies[i];
            }
           }
        for(int i=0; i<n; i++)
        {
            if(candies[i]+ extraCandies >= maxcandy)
                result.add(true);
            else
                result.add(false);
        }
        return result;
        }
        
    };