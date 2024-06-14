package org.leetcode.solutions;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounter++;
                continue;
            }
            nums[i - zeroCounter] = nums[i];
        }
        Arrays.fill(nums, nums.length - zeroCounter, nums.length, 0);
    }
}
