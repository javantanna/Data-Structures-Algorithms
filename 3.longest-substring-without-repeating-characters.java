/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int left=0;
        Set<Character> window=new HashSet<>();
        int maxLen=0;
        for (int right = 0; right < n ; right++){
            char rightChar=s.charAt(right);
            while (window.contains(rightChar)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(rightChar);
            maxLen=Math.max(maxLen,right-left+1);

        }    

        
        return maxLen;
    }
}
// @lc code=end

