package org.leetcode.solutions;
// TODO: review - overflow for positive / negative
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int lastDigit;
        while (x != 0) {
            lastDigit = x % 10;
            if (Math.abs(result) > (Integer.MAX_VALUE - Math.abs(lastDigit)) / 10) {
                return 0;
            }
            result = result * 10 + lastDigit;
            x /= 10;
        }
        return result;
    }
}
