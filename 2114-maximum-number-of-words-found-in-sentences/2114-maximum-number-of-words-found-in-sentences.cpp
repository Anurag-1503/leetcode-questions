class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int max=0,words;
        for(int i=0;i<sentences.size();i++){
            words=0;
            string s=sentences[i];
            for(int j = 0;j < s.size() ;j++)
                if(s[j]==' ') words++;
            words++;   
            max=max > words ? max:words;
        }
        
        return max;
    }
    
};