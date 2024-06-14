package org.leetcode.solutions;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        if (sum > actualSum) {
            return sum - actualSum;
        }
        return 0;
    }
}
