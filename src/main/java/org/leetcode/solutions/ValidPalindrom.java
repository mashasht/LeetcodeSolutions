package org.leetcode.solutions;

public class ValidPalindrom {
    public boolean isPalindrome(String s) {
        String alphanumericLowerCase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < alphanumericLowerCase.length()/2; i++) {
            if (alphanumericLowerCase.charAt(i) != alphanumericLowerCase.charAt(alphanumericLowerCase.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
