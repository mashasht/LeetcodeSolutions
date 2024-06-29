package org.leetcode.solutions;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> consequenceCounter = new HashMap<>();
        int maxConsequence = 0;
        for (int num: nums) {
            if (consequenceCounter.containsKey(num)) {
                continue;
            }
            int right = consequenceCounter.getOrDefault(num + 1, 0);
            int left = consequenceCounter.getOrDefault(num - 1, 0);
            int sum = left + right + 1;
            consequenceCounter.put(num, sum);
            maxConsequence = Math.max(maxConsequence, sum);
            consequenceCounter.put(num - left, sum);
            consequenceCounter.put(num + right, sum);
        }
        return maxConsequence;
    }
}
