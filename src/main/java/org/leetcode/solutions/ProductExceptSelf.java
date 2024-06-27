package org.leetcode.solutions;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productBefore = new int[nums.length];
        int[] productAfter = new int[nums.length];
        productBefore[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            productBefore[i] = productBefore[i - 1] * nums[i - 1];
        }
        productAfter[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productAfter[i] = productAfter[i + 1] * nums[i + 1];
            productBefore[i] *= productAfter[i];
        }
        return productBefore;
    }
}
