class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (ch == '(' || ch == '{' || ch == '[') {
        st.push(ch);
    } else {
        // Check if the stack is empty before peeking or popping
        if (st.isEmpty()) {
            return false; // Unmatched closing bracket, invalid expression
        }
        
        char top = st.peek(); // Get the top element of the stack
        
        if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
            st.pop(); // Matched, pop the corresponding opening bracket
        } else {
            return false; // Mismatched brackets, invalid expression
        }
    }
}

return st.isEmpty(); // If the stack is empty, all brackets are matched and valid

    }
}