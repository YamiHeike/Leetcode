#include<vector>
#include<numeric>
#include<functional>

class Leetcode2638 {
public:
    bool doesValidArrayExist(std::vector<int&> derived) {
        return std::accumulate(derived.begin(), derived.end(), 0, std::bit_xor<>()) == 0;
    }    
};