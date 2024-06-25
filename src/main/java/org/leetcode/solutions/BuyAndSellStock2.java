package org.leetcode.solutions;

public class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
//        int maxProfit = 0;
//        int buyPrice = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i - 1] > buyPrice && prices[i - 1] > prices[i]) {
//                maxProfit += prices[i - 1] - buyPrice;
//                buyPrice = prices[i];
//            }
//            buyPrice = Math.min(buyPrice, prices[i]);
//        }
//        if (prices[prices.length - 1] > buyPrice) {
//            maxProfit += prices[prices.length - 1] - buyPrice;
//        }
//        return maxProfit;
    }
}
