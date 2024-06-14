package org.leetcode.solutions;

import java.util.Arrays;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(toSet());
        return numSet.size() != nums.length;
    }
}
