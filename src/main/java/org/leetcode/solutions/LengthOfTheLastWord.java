package org.leetcode.solutions;

public class LengthOfTheLastWord {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (i == 0 || Character.isSpaceChar(s.charAt(i - 1))) {
                    lastWordLength = 1;
                    continue;
                }
                lastWordLength++;
            }
        }
        return lastWordLength;
    }
}





