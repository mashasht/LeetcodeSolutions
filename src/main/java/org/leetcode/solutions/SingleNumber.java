package org.leetcode.solutions;
// TODO: review it
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xorResult = 0;
        for (int i = 0; i < nums.length; i++) {
            xorResult ^= nums[i];
        }
        return xorResult;
    }
}
