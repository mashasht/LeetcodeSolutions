package org.leetcode.solutions;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int charToCheck = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(charToCheck)) {
                if (charToCheck == s.length() - 1) {
                    return true;
                }
                charToCheck++;
            }
        }
        return false;
    }
}
