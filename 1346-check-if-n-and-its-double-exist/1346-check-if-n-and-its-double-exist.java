class Solution {
    public boolean checkIfExist(int[] arr) {
        
        int n = arr.length;
        Map<Double, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(map.containsKey((double)arr[i]*2) || map.containsKey((double)arr[i]/2)){
                return true;
            }
            map.put((double)arr[i],1);
        }
        return false;
    }
}