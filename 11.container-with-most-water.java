/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left<right){
            int width=right-left;
            
            int h=Math.min(height[left],height[right]);

            int currentArea=width*h;
            maxArea=Math.max(currentArea,maxArea);

            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }



        return maxArea;
    }
}
// @lc code=end

