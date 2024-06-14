package org.leetcode.solutions;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] letterCount = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 97]++;
            letterCount[t.charAt(i) - 97]--;
        }
        for (int j : letterCount) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
