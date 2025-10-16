/*
 * @lc app=leetcode id=136 lang=cpp
 *
 * [136] Single Number
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int xor1=0;
        for(int num:nums){
            xor1^=num;
            
        }

        return xor1;
    }
};
// @lc code=end

