package org.leetcode.solutions;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {
        int startRange = 0;
        int endRange = nums.length - 1;
        while (startRange <= endRange) {
            if (target <= nums[startRange]) {
                return startRange;
            }
            if (endRange - startRange <= 1) {
              if (target <= nums[endRange]) {
                  return endRange;
              }
              return endRange + 1;
            }
            int midRange = startRange + (endRange - startRange)/2;
            if (nums[midRange] <= target) {
                startRange = midRange;
                continue;
            }
            endRange = midRange;
        }
        return endRange;
    }
}



