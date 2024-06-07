package org.leetcode.solutions;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int intermediateResult = 0;
        for (int i = 0; i < nums.length; i++) {
            intermediateResult += nums[i];
            maxSum = Math.max(maxSum, intermediateResult);
            intermediateResult = Math.max(0, intermediateResult);
        }
        return maxSum;
    }
}
