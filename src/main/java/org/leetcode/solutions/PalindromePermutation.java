package org.leetcode.solutions;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        int[] lettersCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lettersCounter[s.charAt(i) - 97]++;
        }
        boolean seenOne = false;
        for (int i = 0; i < 26; i++) {
            if (lettersCounter[i] % 2 != 0) {
                if (seenOne) {
                    return false;
                }
                seenOne = true;
            }
        }
        return true;
    }
}
