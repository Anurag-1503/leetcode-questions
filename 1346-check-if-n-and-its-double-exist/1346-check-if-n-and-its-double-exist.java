class Solution {
    public boolean checkIfExist(int[] arr) {
        
         Map<Integer, Integer> map = new HashMap<>();

        // Handle the zero case separately
        int zeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        if (zeroCount > 1) {
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            int doubleValue = arr[i] * 2;
            int halfValue = arr[i] / 2;

            // Check if doubleValue is present in the map
            if (map.containsKey(doubleValue) && map.get(doubleValue) > 0) {
                return true;
            }

            // Check if halfValue is present in the map
            if (arr[i] % 2 == 0 && map.containsKey(halfValue) && map.get(halfValue) > 0) {
                return true;
            }
        }

        return false;
    }
}