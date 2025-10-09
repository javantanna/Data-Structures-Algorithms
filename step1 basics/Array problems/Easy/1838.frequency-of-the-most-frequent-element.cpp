/*
 * @lc app=leetcode id=1838 lang=cpp
 *
 * [1838] Frequency of the Most Frequent Element
 */

// @lc code=start
#include <vector>
#include <algorithm>
using namespace std;
class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int n=sizeof(nums)/ sizeof(nums[0]);

        int left=0;
        int maxx=1;
        long sum=0;

        for(int right=0;right<n;right++){
            sum+=nums[right];

            while((long)nums[right]*(right-left+1)-sum > k){
                sum-=nums[left];
                left++;
            }
            maxx=max(maxx,(right-left+1));
        }
        return maxx;
    }
};
// @lc code=end

