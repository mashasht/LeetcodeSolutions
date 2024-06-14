package org.leetcode.solutions;

public class ShortestWordDistance {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        // ["practice", "makes", "perfect", "coding", "makes"]
        // word1 = "coding", word2 = "practice"
        int shortestDist = Integer.MAX_VALUE;
        int word1Pos = -1;
        int word2Pos = -1;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                word1Pos = i;
                if (word2Pos != -1) {
                    shortestDist = Math.min(word1Pos - word2Pos, shortestDist);
                }
            }

            if (wordsDict[i].equals(word2)) {
                word2Pos = i;
                if (word1Pos != -1) {
                    shortestDist = Math.min(word2Pos - word1Pos, shortestDist);
                }
            }
        }
        return shortestDist;
    }
}
