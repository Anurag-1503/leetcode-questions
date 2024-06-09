class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = num.length -1 ; i >=0 ; i--) {
            //add k to last index , and place only unit place digit in that last index , rest take it as k
            res.add(0,(num[i]+k)%10);
            //update k
            k = (num[i]+k)/10;
        }
        //check if k is still remaining , if yes , then add it to 0th index
        while(k>0) {
            res.add(0,k%10);
            k=k/10;
        }
            
        return res;
        
    }
}