class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x=0;
        for(int i=0;i<operations.size();i++){
            if(operations[i].at(1)=='+')
                x++;
            if(operations[i].at(1)=='-')
                x--;
        }
        return x;
    }
};