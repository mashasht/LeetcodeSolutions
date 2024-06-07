package org.leetcode.solutions;

public class ArrayJumps {
    public boolean hasSolution(int[] jumpArr, int index) {
        if (jumpArr[index] == 0) {
            return true;
        }
        if (index - jumpArr[index] < 0 || index + jumpArr[index] >= jumpArr.length) {
            return false;
        }
        return hasSolution(jumpArr, index - jumpArr[index]) || hasSolution(jumpArr, index + jumpArr[index]);
    }
}
