package org.leetcode.solutions;

import java.util.Arrays;

public class MinimumSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sumOfCurrentWindow = 0;
        int res = Integer.MAX_VALUE;
        for (; right < nums.length; right++) {
            sumOfCurrentWindow += nums[right];
            while (sumOfCurrentWindow >= target) {
                res = Math.min(res, right - left + 1);
                sumOfCurrentWindow -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
