package org.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
          if (i == 0 || nums[i -1] != nums[i]) {
              findThreeSum(nums, i, result);
          }
        }
        return result;
    }
    private void findThreeSum(int[] nums, int i, List<List<Integer>> result) {
        int lo = i + 1;
        int hi = nums.length - 1;
        while(lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum == 0) {
                result.add(List.of(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1]) ++lo;
                continue;
            }
            if (sum > 0) {
                hi--;
            }
            else {
                lo++;
            }
        }
    }
}
