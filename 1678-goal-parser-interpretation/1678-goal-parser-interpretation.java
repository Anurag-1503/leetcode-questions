class Solution {
    public String interpret(String command) {
        
        String command2="",command3="";
        command2=command.replace("()","o");
        command3=command2.replace("(al)","al");
        
        return command3;
        
    }
}