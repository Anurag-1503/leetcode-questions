class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        char[] c_arr = s.toCharArray();
        
        for(int i = 0 ; i < s.length() ; i++){
            char curr = c_arr[i];
            
            //if stack is empty , it mean its a start of new primitive string
            //push in stack and add index in list
            if(st.isEmpty())
            {
                st.push(curr);
                list.add(i);
            }
            else if(curr == '(' && st.peek() == ')')
            {
                st.pop();
                if(st.isEmpty())
                    list.add(i);
            }
            else if(curr == ')' && st.peek() == '(')
            {
                st.pop();
                if(st.isEmpty())
                    list.add(i);
            }
            else
                st.push(curr);
            
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < list.size() ; i+=2){
            sb.append(s.substring(list.get(i)+1 , list.get(i+1)));
        }
        
        return sb.toString();
        
    }
}