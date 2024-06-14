package org.leetcode.solutions;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounter = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letterCounter[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            letterCounter[ransomNote.charAt(i) - 97]--;
            if (letterCounter[ransomNote.charAt(i) - 97] < 0) {
                return false;
            }
        }
        return true;
    }
}
