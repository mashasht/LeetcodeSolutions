package org.leetcode.solutions;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int readIndexN = n - 1;
        int readIndexM = m - 1;
        int writeIndex = nums1.length - 1;
        while (readIndexN >= 0 || readIndexM >= 0) {
            if (readIndexN < 0 || readIndexM >= 0 && nums1[readIndexM] > nums2[readIndexN]) {
                nums1[writeIndex] = nums1[readIndexM];
                readIndexM--;
            }
            else {
                nums1[writeIndex] = nums2[readIndexN];
                readIndexN--;
            }
            writeIndex--;
        }
    }
}
