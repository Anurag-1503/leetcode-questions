class Solution {
    
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return result;
        
        Map<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        
        StringBuilder temp = new StringBuilder();
        Solve(0 , digits , temp , map);
        return result;
        
    }
    
    public void Solve(int index , String digits , StringBuilder temp , Map<Character , String> map){
        
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }
        
        //get the first Character from input string
        char ch = digits.charAt(index);
        //get the corresponding letters assosiated with the Character
        String str = map.get(ch);
        
        for(int i = 0 ; i < str.length() ; i++){
            temp.append(str.charAt(i));
            Solve(index + 1, digits , temp , map);
            temp.deleteCharAt(temp.length() - 1);
        }
        
        
    }
}