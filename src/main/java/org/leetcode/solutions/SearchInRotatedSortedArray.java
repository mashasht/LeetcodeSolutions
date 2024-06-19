package org.leetcode.solutions;
// TODO: rewrite with just one search
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int rotationIndex = findRotationPoint(nums);
        if (target < nums[rotationIndex]) {
            return -1;
        }
        if (target >= nums[rotationIndex] && target <= nums[nums.length -1]) {
            return findTarget(nums, target, rotationIndex, nums.length -1);
        }
        if (rotationIndex > 0 && target >= nums[0] && target <= nums[rotationIndex - 1]) {
            return findTarget(nums, target, 0, rotationIndex - 1);
        }
        return -1;
    }

    private int findTarget(int[] nums, int target, int start, int end) {
        if (start == end) {
            return target == nums[start] ? start : -1;
        }
        int middle = start + (end - start) / 2;
        while (middle != start && middle != end) {
            if (nums[middle] == target) {
                return middle;
            }
            if (target < nums[middle]) {
                end = middle;
                middle = start + (end - start) /2;
                continue;
            }
            start = middle;
            middle = start + (end - start) /2;
        }
        if (nums[middle] == target) {
            return middle;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }

    private int findRotationPoint(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return 0;
        }
        int middle = nums.length / 2;
        int start = 0;
        int end = nums.length - 1;
        while(middle != start && middle != end) {
            if (nums[start] > nums[middle]) {
                end = middle;
                middle = start + (end - start) / 2;
                continue;
            }
            start = middle;
            middle = start + (end - start) / 2;
        }
        if (nums[start] < nums[end]) {
            return start;
        }
        return end;
    }
}
