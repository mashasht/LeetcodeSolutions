package org.leetcode.solutions;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisonedDur = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration <= timeSeries[i + 1]) {
                poisonedDur += duration;
                continue;
            }
            poisonedDur += timeSeries[i + 1] - timeSeries[i];
        }
        poisonedDur += duration;
        return poisonedDur;
    }
}
