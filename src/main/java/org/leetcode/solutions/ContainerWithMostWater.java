package org.leetcode.solutions;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int finish = height.length - 1;
        while (start < finish) {
            maxArea = Math.max(maxArea, (finish - start) * Math.min(height[start], height[finish]));
            if (height[start] > height[finish]) {
                finish--;
            }
            else {
                start++;
            }
        }
        return maxArea;
    }
}
