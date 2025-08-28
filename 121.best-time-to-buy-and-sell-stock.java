/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=0;
        int sell=1;

        while(sell<prices.length){
            if(prices[sell]>prices[buy]){
                int currentProfit=prices[sell]-prices[buy];

                maxProfit=Math.max(maxProfit, currentProfit);
            }
            else{
                buy=sell;
            }
            sell++;
            
        }
        return maxProfit;
    }
}

// @lc code=end

