package org.leetcode.solutions;

public class StringToInteger {
    public int myAtoi(String s) {
        long result = 0;
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0) == '-' ? -1: sign;
            s = s.substring(1);
        }
        char[] characters = s.toCharArray();
        for (char character : characters) {
            if (!Character.isDigit(character)) {
                break;
            }
            if (result > Integer.MAX_VALUE / 10 + character + '0') {
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + character - '0';

        }
        return (int)result * sign;
    }
}
