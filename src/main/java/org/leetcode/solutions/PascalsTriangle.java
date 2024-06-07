package org.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> firstRow = new LinkedList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (numRows == 1) {
            return result;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> nextRow = new LinkedList<>();
            nextRow.add(1);
            for (int j = 1; j < i - 1; j++) {
                nextRow.add(result.getLast().get(j - 1) + result.getLast().get(j));
            }
            nextRow.add(1);
            result.add(nextRow);
        }
        return result;
    }
}
