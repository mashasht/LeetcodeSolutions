package org.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LongestCommonSubsequence {
    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        if (arrays == null || arrays.length == 0) {
            return new LinkedList<>();
        }
        List<Integer> result = new java.util.ArrayList<>(Arrays.stream(arrays[0]).boxed().toList());
        int[] counters = new int[arrays.length - 1];
        for (int i = 0; i < result.size(); i++) {
            Integer current = result.get(i);
            for (int j = 1; j < arrays.length; j++) {
                while (counters[j - 1] < arrays[j].length - 1 && arrays[j][counters[j - 1]] < current) {
                    counters[j - 1]++;
                }
                if (arrays[j][counters[j - 1]] != current) {
                    result.remove(i);
                    if (i == result.size()) {
                        return result;
                    }
                    i--;
                    break;
                }
            }
        }
        return result;
    }
}
