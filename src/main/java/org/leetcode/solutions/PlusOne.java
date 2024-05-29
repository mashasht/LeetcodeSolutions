package org.leetcode.solutions;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i] + carry;
            digits[i] = result % 10;
            carry = result / 10;
            if (carry == 0) {
                return digits;
            }
        }
        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            return newDigits;
        }
        return digits;
    }
}


