package org.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        List<int[]> result = new ArrayList<>();
        int intervalStart = intervals[0][0];
        int intervalEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervalEnd) {
                intervalEnd = Math.max(intervalEnd, intervals[i][1]);
            }
            else {
                result.add(new int[]{intervalStart, intervalEnd});
                intervalStart = intervals[i][0];
                intervalEnd = intervals[i][1];
            }
        }
        result.add(new int[]{intervalStart, intervalEnd});
        return result.toArray(new int[result.size()][2]);
    }
}
