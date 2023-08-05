class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        ArrayList<Boolean> arr = new ArrayList<>();       
        
        for(int i = 0 ;i < n; i++)
        {
            if(maxCandies <  candies[i])
                maxCandies = candies[i];  
        }
        for(int i = 0; i<n ; i++)
        {
            if(candies[i] + extraCandies >= maxCandies )
                arr.add(true);
            else
                arr.add(false);
            
        }
        
        return arr;
    }
}