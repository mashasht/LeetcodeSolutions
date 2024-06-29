package org.leetcode.solutions;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        while (leftIndex < rightIndex) {
            int sum = numbers[leftIndex] + numbers[rightIndex];
            if (sum == target) {
                return new int[]{leftIndex, rightIndex};
            }
            if (sum < target) {
                leftIndex++;
                continue;
            }
            rightIndex++;
        }
        return new int[]{-1, -1};
    }
}
