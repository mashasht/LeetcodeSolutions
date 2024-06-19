package org.leetcode.solutions;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        long quotient = 0;
        long unsignedDivident = Math.abs((long)dividend);
        long unsignedDivisor = Math.abs((long)divisor);
        for (int i = 31; i >= 0; i--) {
            if (unsignedDivident >= (unsignedDivisor << i)) {
                quotient += (1L << i);
                unsignedDivident -= (unsignedDivisor << i);
            }
        }
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            return returnValueOrMaxMin(quotient * (-1));
        }
        return returnValueOrMaxMin(quotient);
    }

    private int returnValueOrMaxMin(long quotient) {
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) quotient;
    }
}
