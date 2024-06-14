package org.leetcode.solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        nums2Set.retainAll(nums1Set);
        return nums2Set.stream().mapToInt(Number::intValue).toArray();
    }
}
