class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //O(m * nlog(n)) where O(m) to iterate in array and O(nlogn) to sort
        Map<String , List<String>> map = new HashMap<>();
        
        for(String s : strs){
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            //check if its already there in the map
             if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());  // Add new list if key doesn't exist
            }
            map.get(sorted).add(s); 
        }
        
        return new ArrayList<>(map.values());
    }
}