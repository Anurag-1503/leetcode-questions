class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans =  new ArrayList<>();
        
        for(int i = 0 ; i < candies.length ; i++){
            int current = candies[i] + extraCandies;
            boolean flag = true;
            for(int j = 0 ; j < candies.length ; j++){
                if(i != j && current < candies[j]){
                    flag = false;
                    break;
            }
            }
            ans.add(flag);

        }
        
        
        return ans;
        
    }
}