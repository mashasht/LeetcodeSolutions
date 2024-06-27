package org.leetcode.solutions;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasCount = 0;
        int start = -1;
        for (int i = 0; i < gas.length; i++) {
            totalGasCount += gas[i] - cost[i];
            if (totalGasCount < 0) {
                totalGasCount = 0;
                start = i + 1;
            }
        }
        int totalCost = 0;
        for (int i = 0; i < gas.length - 1; i++) {
            totalCost += gas[i] - cost[i];
        }
        if (totalCost >= 0) {
            return start;
        }
        return -1;
    }
}
