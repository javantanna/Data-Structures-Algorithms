/*
 * @lc app=leetcode id=268 lang=cpp
 *
 * [268] Missing Number
 */

// @lc code=start
#include <vector>
#include<iostream>
using namespace std;
class Solution {
public:
    // int missingNumber(vector<int>& nums) {
    //     int n=nums.size();
    //     int sum=(n*(n+1)/2);
    //     cout<<sum;

    //     int s2=0;
    //     for(int i=0;i<n;i++){
    //         s2+=nums[i];
    //     }

    //     int missingNumber=sum-s2;
    //     return missingNumber;
        
    // }


    int missingNumber(vector<int>& nums){
        int n=nums.size();
        int xor1=0;
        int xor2=0;

        for (int i=1;i<=n;i++){
            xor1^=i;
        }

        for(int num:nums){
            xor2^=num;
        }

        return xor1^xor2;
    }
};
// @lc code=end

