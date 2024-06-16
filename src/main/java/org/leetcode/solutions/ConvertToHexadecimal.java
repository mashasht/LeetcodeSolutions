package org.leetcode.solutions;

public class ConvertToHexadecimal {
    public String toHex(int num) {
        int remainder = num;
        StringBuilder result = new StringBuilder();
        while(Math.abs(remainder) > 0) {
            int nextDigit = remainder & 15;
            if (nextDigit > 9) {
                result.append(Character.toString(nextDigit - 10 + 97));
            }
            else {
                result.append(nextDigit);
            }
            remainder >>>= 4;
        }
        return result.reverse().toString();
    }
}
