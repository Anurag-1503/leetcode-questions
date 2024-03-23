class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> result = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int n = 0;
        
        for(char c : s.toCharArray()){
            
            if(Character.isDigit(c))
            {
                n = n * 10 + (c - '0');
            }
            else if(c == '[') {
                counts.push(n);
                n = 0;
                result.push(sb);
                sb = new StringBuilder();
            }
            else if(c == ']') {
                int k = counts.pop();
                StringBuilder temp = sb;
                sb = result.pop();
                while(k > 0){
                    sb.append(temp);
                    k--;
                }
            }
            else
                sb.append(c);
        }
        return sb.toString();
        
    }
}