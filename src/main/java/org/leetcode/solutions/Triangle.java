package org.leetcode.solutions;
import java.util.List;
// TODO: rewrite using array

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int minPath = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if (j > 0) {
                    left = triangle.get(i - 1).get(j - 1);
                }
                if (j < triangle.get(i).size() - 1) {
                    right = triangle.get(i - 1).get(j);
                }
                triangle.get(i).set(j, Math.min(left, right) + triangle.get(i).get(j));
                if (i == triangle.size() - 1) {
                    minPath = Math.min(minPath, triangle.get(i).get(j));
                }
            }
        }
        return minPath;
    }
}
