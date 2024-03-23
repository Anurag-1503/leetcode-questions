class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()) {
            
            //if stack is empty , push the character in stack
            if(st.isEmpty())
                st.push(c);
            
            else if(c == ')' && st.peek() == '(')
                st.pop();
            else
                st.push(c);
            
        }
        
        return st.size();
        
    }
}