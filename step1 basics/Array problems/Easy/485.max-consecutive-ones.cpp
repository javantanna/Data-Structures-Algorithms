/*
 * @lc app=leetcode id=485 lang=cpp
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxx=0;
        int n=nums.size();
        int left=0;
        if(n==1 ){
            if(nums[0]==0){
                return 0;
            }
            else{
                return 1;
            };
        }
        for(int right=0;right<n;right++){
            if(nums[right]!=1){
                left=right+1;
            }
            maxx=max(maxx,right-left+1);
        }
        return maxx;
    }
};
// @lc code=end

