package org.leetcode.solutions;

import java.util.*;
// TODO: review
public class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        int start = lower;
        for (int curr : nums) {
            if (start == curr) {
                start++;
            } else {
                result.add(Arrays.asList(start, curr-1));
                start = curr + 1;
            }
        }
        if (start <= upper) result.add(Arrays.asList(start, upper));
        return result;
    }
}
