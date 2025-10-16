/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 */

// @lc code=start
#include <vector>
#include <unordered_map>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int ,int> mp;
        int n=nums.size();
        for(int i=0;i <n;i++){
            int compliment=target-nums[i];
            if(mp.find(compliment) !=mp.end()){
                return{mp[compliment],i};
            }

            mp[nums[i]]=i;
        }
        return {};
    }
};
// @lc code=end

