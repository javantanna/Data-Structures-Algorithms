#include <vector>
#include <iostream>
using namespace std;

class LSubArrSum {
public:
    int longestArr(vector<int>& nums, int k) {
        int n = nums.size();
        int maxLen = 0;
        int left = 0;
        long long sum = nums[0];
        int right=0;

        while(right<n){
            while(left<=right && sum>k){
                sum-=nums[left];
                left++;
            }

            if(sum==k){
                maxLen=max(maxLen,right-left+1);
            }
            right++;
            if(right<n) sum+=nums[right];
        }
        return maxLen;
    }
};

int main() {
    vector<int> nums = {2, 3,-1,1, 5};
    LSubArrSum la = LSubArrSum();

    int ans = la.longestArr(nums, 5);
    cout << ans << std::endl;  // Corrected here!

    return 0;
}
