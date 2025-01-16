#include<vector>
using std::vector;

class Leetcode2425 {
    int getXor(const vector<int>& v) {
        int result = v.at(0);
        for(auto it = v.begin() + 1; it < v.end(); ++it) {
            result ^= *it;
        }
        return result;
    }
public:
    int xorAllNums(vector<int>& nums1, vector<int>& nums2) {
        size_t x = nums1.size();
        size_t y = nums2.size();
        if(x % 2 == 0 && y % 2 == 0) return 0;
        else if(x % 2 == 0) return getXor(nums1);
        else if(y % 2 == 0) return getXor(nums2);
        else return getXor(nums1) ^ getXor(nums2);
    }
};