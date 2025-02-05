#include<vector>

class Solution {
public:
    bool isArraySpecial(std::vector<int>& nums) {
        for(auto i = nums.begin(); i != nums.end() - 1; ++i) {
            if(*i % 2 == *(i+1) % 2) return false;
        }
        return true;
    }

    bool isArraySpecialAdjFind(std::vector<int>& nums) {
        return std::adjacent_find(nums.begin(), nums.end(), 
        [](int a, int b) {
            return a % 2 == b % 2;
        }) == nums.end();
    }
};