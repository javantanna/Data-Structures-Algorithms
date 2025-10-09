/*
 * @lc app=leetcode id=125 lang=cpp
 *
 * [125] Valid Palindrome
 */

// @lc code=start
#include <iostream>
#include<string>
#include <cctype>
using namespace std;
class Solution {
public:
    bool isPalindrome(string s) {

        if(s.empty() || s==""){
            return true;
        }
        int left=0;
        int right=s.size()-1;
        while(left<right){

            char leftChar=tolower(s[left]);
            char rightChar=tolower(s[right]);

            if (!isalnum(s[left])) {
                left++;
                continue;
            }
            if (!isalnum(s[right])) {
                right--;
                continue;
            }

            if (tolower(s[left]) != tolower(s[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};
// @lc code=end

