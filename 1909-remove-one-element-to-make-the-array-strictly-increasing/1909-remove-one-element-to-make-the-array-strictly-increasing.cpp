class Solution {
public:
    bool canBeIncreasing(vector<int>& nums) {
    
        int lcount=0,rcount=0;
        int last=nums[nums.size()-1];
        
         for(int i=nums.size()-2;i>=0;i--){
            if(nums[i]<last) last=nums[i];
            else rcount++;
        }
        int first=nums[0];
        for(int i=1;i<nums.size();i++){
            if(nums[i]>first)
                first=nums[i];
            else
                lcount++;
        }
       
        return min(lcount,rcount)<=1;
    }
};