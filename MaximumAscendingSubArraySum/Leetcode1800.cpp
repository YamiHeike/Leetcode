#include<vector>
using std::vector;

class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int prev = nums.at(0);
        int maxSum = nums.at(0);
        int currSum = nums.at(0);
        
        for(vector<int>::iterator i = nums.begin() + 1; i != nums.end(); i++) {
            if(*i > prev) currSum += *i;
            else currSum = *i;
            if (currSum > maxSum) maxSum = currSum;
            prev = *i;
        }

        return maxSum;
    }
};