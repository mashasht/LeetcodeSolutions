package org.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;
// TODO: solve it
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> newResult = new LinkedList<>();
        return returnNextCombination(candidates, target, newResult);
    }

    private List<List<Integer>> returnNextCombination(int[] candidates, int target, List<List<Integer>> previousResult) {
        List<List<Integer>> newResult = new LinkedList<>();
        boolean hasReachedEnd = true;
        for (List<Integer> numbers: previousResult) {
            int sum = numbers.stream().reduce(0, Integer::sum);
            if (sum == target) {
                newResult.add(numbers);
                continue;
            }
            for (int candidate : candidates) {
                if (sum + candidate <= target) {
                    hasReachedEnd = false;
                    List<Integer> sumCandidates = new LinkedList<>(numbers);
                    sumCandidates.add(candidate);
                    newResult.add(sumCandidates);
                }
            }
        }
        if (hasReachedEnd) {
            return newResult;
        }
        return returnNextCombination(candidates, target, newResult);
    }
}
