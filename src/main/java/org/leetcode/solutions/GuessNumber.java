package org.leetcode.solutions;

public class GuessNumber {
    public int pick;
    public GuessNumber(int pick) {
        this.pick = pick;
    }
    public GuessNumber() {
        this.pick = 0;
    }

    int guess(int num) {
        if (num > pick) {
            return -1;
        }
        if (num < pick) {
            return 1;
        }
        return 0;
    }
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (high - low > 1) {
            int middle = low + (high - low) / 2;
            if (guess(middle) == 0) {
                return middle;
            }
            if (guess(middle) > 0) {
                low = middle;
            }
            if (guess(middle) < 0) {
                high = middle;
            }
        }
        if (guess(low) == 0) {
            return low;
        }
        return high;
    }
}

