class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char curr = s.charAt(i);
            //if it is opening parentheses , just push it in stack
            if(curr == '(' || curr == '{' || curr == '[')
                st.push(curr);
            else 
            {
                if(st.isEmpty())
                    return false;
                //check if corresponding opening parentheses is available for closing parantheses in stack or not
                else if(curr == ')' && st.peek() == '(')
                    st.pop();
                else if(curr == ']' && st.peek() == '[')
                    st.pop();
                else if(curr == '}' && st.peek() == '{')
                    st.pop();
                else
                    return false;
                
               
            }
        }
        
        //if stack is empty , then string is valid
        return st.isEmpty();
        
    }
}