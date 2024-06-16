package org.leetcode.solutions;

import java.util.Arrays;

public class ThirdMax {
    public int thirdMax(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] maxes = new int[3];
        maxes[0] = Integer.MIN_VALUE;
        maxes[1] = Integer.MIN_VALUE;
        maxes[2] = Integer.MIN_VALUE;
        if (nums.length < 3) {
            return Arrays.stream(nums).max().getAsInt();
        }

        for(final int num : nums){
            if(num > maxes[0]) {
                maxes[2] = maxes[1];
                maxes[1] = maxes[0];
                maxes[0] = num;
            } else if(maxes[0] > num && num > maxes[1]) {
                maxes[2] = maxes[1];
                maxes[1] = num;
            } else if(maxes[1] > num && num > maxes[2]) {
                maxes[2] = num;
            }
        }

        return maxes[2];
    }
}
