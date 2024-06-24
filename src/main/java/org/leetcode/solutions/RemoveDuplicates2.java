package org.leetcode.solutions;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        int j = i;
        for (; i < nums.length && j < nums.length; i++) {
            if (nums[j - 2] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;

//        if (nums.length <= 2) {
//            return nums.length;
//        }
//        int previous = nums[0];
//        int duplicatesCounter = 1;
//        int removedElements = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (previous == nums[i]) {
//                duplicatesCounter++;
//            }
//            if (previous != nums[i]) {
//                duplicatesCounter = 1;
//            }
//            previous = nums[i];
//            if (duplicatesCounter > 2) {
//                nums[i] = Integer.MAX_VALUE;
//                removedElements++;
//            }
//        }
//        Arrays.sort(nums);
//        return nums.length - removedElements;
    }
}
