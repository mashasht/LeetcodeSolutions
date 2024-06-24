package org.leetcode.solutions;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.ceil(Math.sqrt(area));
        for (int i = sqrt; i <= area; i++) {
            if (area % i == 0) {
                return new int[]{i, area / i};
            }
        }
        return new int[]{-1, -1};
    }
}
