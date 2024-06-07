package org.leetcode.solutions;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;
        int curMaxReach = 0;
        int nextMaxReach = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            nextMaxReach = Math.max(nextMaxReach, i + nums[i]);
            if (i == curMaxReach) {
                jumps++;
                curMaxReach = nextMaxReach;
            }
        }

        return jumps;
    }
}
