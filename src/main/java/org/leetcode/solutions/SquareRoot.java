package org.leetcode.solutions;
//TODO: rewrite using binary search
public class SquareRoot {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        for (int i = 1; i <= x/2; i++) {
            if (x / i == i) {
                return i;
            }
            if (x / i < i) {
                return i - 1;
            }
        }
        return 1;
    }
}

