/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()<t.length()){
            return "";
        }
        
        Map<Character,Integer> requiredCounts=new HashMap<>();
        for(char c:t.toCharArray()){
            requiredCounts.put(c,requiredCounts.getOrDefault(c,0)+1);
        }

        int left=0;

        int formed=0;
        int required=t.length();
        int min=Integer.MAX_VALUE;
        Map<Character,Integer> windowCount=new HashMap<>();
        int resultStart=0;
        for (int right=0;right<s.length();right++){
            char rightChar=s.charAt(right);
            windowCount.put(rightChar,windowCount.getOrDefault(rightChar, 0) +1);
            if(requiredCounts.containsKey(rightChar)&& windowCount.get(rightChar)<=requiredCounts.get(rightChar)){
                formed++;
            }

            while (left<=right && formed==required) {
                int currentLen=right-left+1;
                if(currentLen<min){
                    min=currentLen;
                    resultStart=left;
                }
                char leftChar=s.charAt(left);

                windowCount.put(leftChar,windowCount.get(leftChar)-1);

                if(requiredCounts.containsKey(leftChar)&& windowCount.get(leftChar)<requiredCounts.get(leftChar)){
                    formed--;
    
                }   
                left++;

                
            }


        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(resultStart,resultStart+min);
        }

    }
}
// @lc code=end

