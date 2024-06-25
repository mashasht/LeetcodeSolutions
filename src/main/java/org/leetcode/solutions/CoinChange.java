package org.leetcode.solutions;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin < i && dp[i - coin] != -1 || coin == i) {
                    minCoins = Math.min(minCoins, dp[i - coin] + 1);
                }
            }
            if (minCoins != Integer.MAX_VALUE) {
                dp[i] = minCoins;
            }
            else {
                dp[i] = -1;
            }
        }
        return dp[amount];
     }
}
