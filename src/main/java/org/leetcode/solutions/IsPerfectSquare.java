package org.leetcode.solutions;

public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int squareRoot = num / 2;
        while (true) {
            if (squareRoot * squareRoot == num) {
                return true;
            }
            if (squareRoot * squareRoot > num) {
                squareRoot -= squareRoot / 2;
            }
            if (squareRoot * squareRoot < num) {
                squareRoot += squareRoot / 2;
            }
            if (squareRoot / 2 == 1 && squareRoot * squareRoot != num) {
                return false;
            }

        }
    }
}
