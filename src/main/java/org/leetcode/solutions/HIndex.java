package org.leetcode.solutions;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int maxHIndex = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            maxHIndex = Math.max(Math.min(citations.length - i, citations[i]), maxHIndex);
        }
        return maxHIndex;
    }
}
