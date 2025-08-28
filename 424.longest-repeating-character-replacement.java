/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int left=0;
        int maxFreq=0;
        int maxLen=0;
        int n=s.length();
        for(int right=0;right<n;right++){
            char rightChar=s.charAt(right);
            count[rightChar-'A']++;
            maxFreq=Math.max(maxFreq,count[rightChar-'A']);
            int windowLen=right-left+1;
            if(windowLen-maxFreq>k){
                char leftChar=s.charAt(left);
                count[leftChar-'A']--;
                left++;

            }

            maxLen=Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
// @lc code=end

