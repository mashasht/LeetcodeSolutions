package org.leetcode.solutions;


import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int[][] resultArr = new int[intervals.length + 1][2];
        boolean inserted = false;
        for (int i = 0; i < intervals.length + 1; i++) {
            if (inserted) {
                resultArr[i] = intervals[i - 1];
                continue;
            }
            if (i < intervals.length && intervals[i][0] < newInterval[0]) {
                resultArr[i] = intervals[i];
                continue;
            }
            resultArr[i] = newInterval;
            inserted = true;

        }
        if (!inserted) {
            resultArr[intervals.length] = newInterval;
        }
        List<int[]> resultList = new LinkedList<>();
        int start = resultArr[0][0];
        int end = resultArr[0][1];
        for (int i = 1; i < resultArr.length; i++) {
            if (resultArr[i][0] > end) {
                resultList.add(new int[]{start, end});
                start = resultArr[i][0];
                end = resultArr[i][1];
                continue;
            }
            end = Math.max(resultArr[i][1], end);
        }
        resultList.add(new int[]{start, end});
        return resultList.toArray(new int[resultList.size()][2]);
    }
}
