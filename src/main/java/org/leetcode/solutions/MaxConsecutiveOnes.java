package org.leetcode.solutions;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            }
            if ((i == nums.length - 1 || nums[i] == 0) && counter != 0) {
                maxCounter = Math.max(counter, maxCounter);
                counter = 0;
            }
        }
        return maxCounter;
    }
}
