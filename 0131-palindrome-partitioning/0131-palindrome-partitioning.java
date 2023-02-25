class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> ds = new ArrayList<>();
        func(0,s,ds,ans);
        return ans;
    }
    
    private void func(int index, String s, List<String> ds, List<List<String>> ans)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<s.length();i++)
        {
            if(isPalin(s,index,i))
            {
                ds.add(s.substring(index,i+1));
                func(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    boolean isPalin(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
}