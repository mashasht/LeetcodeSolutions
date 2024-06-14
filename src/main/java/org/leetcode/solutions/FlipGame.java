package org.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

public class FlipGame {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < currentState.length() - 1; i++) {
            if (currentState.substring(i, i + 2).equals("++")) {
                result.add(currentState.substring(0, i) + "--" + currentState.substring(i + 2));
            }
        }
        return result;
    }
}
