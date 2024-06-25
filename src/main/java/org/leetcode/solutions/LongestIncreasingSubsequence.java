package org.leetcode.solutions;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] sequences = new int[nums.length];
        Arrays.fill(sequences, 1);
        int maxSubsequenceLength = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    sequences[i] = Math.max(sequences[i], sequences[j] + 1);
                    maxSubsequenceLength = Math.max(maxSubsequenceLength, sequences[i]);
                }
            }
        }
        return maxSubsequenceLength;
    }
}
