package org.leetcode.solutions;

public class isUglyNumber {
    public boolean isUgly(int n) {
        for (int i: new int[]{2, 3, 5}) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
}
