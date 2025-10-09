/*
 * @lc app=leetcode id=509 lang=cpp
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
public:
    int fib(int n) {
        
        if(n==0){
            return 0;
        }
        if (n==1){return 1;}
        int fibNum=0;
        int prev1=1;
        int prev2=0;
        for (int i = 2;i<=n;i++){
            fibNum=prev2+prev1;
            
            prev2=prev1;
            prev1=fibNum;
        }

        return fibNum;
    }
};
// @lc code=end

