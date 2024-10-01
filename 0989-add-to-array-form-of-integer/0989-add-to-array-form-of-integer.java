class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = num.length - 1 ; i >= 0 ; i--) {
            //add k to last element of array and then place only unit digit
            res.add(0,(num[i]+k)%10);
            //then update k
            k = (num[i]+k)/10;
            
        }
        
        //check if k still holds some value or not
        while(k > 0) {
            res.add(0,k%10);
            //again update k
            k = k/10;
        }
        return res;
    }
}