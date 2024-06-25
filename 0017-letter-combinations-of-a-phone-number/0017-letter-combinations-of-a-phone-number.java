class Solution {
    
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return result;
        
        //Mapping every digit from 2-9 to its respective characters
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        StringBuilder sb = new StringBuilder();
        solve(0,digits,sb,map);
        
        return result;
    }
    
    public void solve(int index , String digits , StringBuilder sb , Map<Character , String> map) {
        
        if(index >= digits.length())
        {
            result.add(sb.toString());
            return;
        }
        
        char ch = digits.charAt(index);
        String str = map.get(ch);
        
        for(int i = 0 ; i < str.length() ; i++) {
            sb.append(str.charAt(i));
            solve(index+1,digits,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}