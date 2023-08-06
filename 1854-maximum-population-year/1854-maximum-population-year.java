class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i = 0 ; i< logs.length ; i++){
            for(int j = logs[i][0]; j < logs[i][1] ; j++){
                arr[j - 1950]++;
            }
        }
        int maxval = 0;
        int maxyear = 1950;
        for(int i = 0; i < 101; i++){
            if(maxval < arr[i]){
                maxval = arr[i];
                maxyear = i + 1950;
            }
        }
        return maxyear;
    }
}