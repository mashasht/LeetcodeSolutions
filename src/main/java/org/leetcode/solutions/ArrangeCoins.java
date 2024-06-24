package org.leetcode.solutions;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int rowCounter = 1;
        while (n > 0) {
            n -= rowCounter;
            rowCounter++;
        }
        return rowCounter - 1;
    }
}
