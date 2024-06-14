package org.leetcode.solutions;

public class AddDigits {
    public int addDigits(int num) {
        int sum = Integer.MAX_VALUE;
        int remainder = num;
        while (sum / 10 > 0) {
            sum = 0;
            while (remainder > 0) {
                sum += remainder % 10;
                remainder = remainder / 10;
            }
            remainder = sum;
        }
        return sum;
    }
}
