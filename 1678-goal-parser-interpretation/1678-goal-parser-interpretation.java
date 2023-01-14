class Solution {
    public String interpret(String command) {
        
        String command2="";
        command2=command.replace("()","o").replace("(al)","al");
       
        
        return command2;
        
    }
}