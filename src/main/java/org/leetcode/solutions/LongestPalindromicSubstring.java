package org.leetcode.solutions;


public class LongestPalindromicSubstring {
    public String findLongestPalindromicString(String input) {
        String longestPalindrome = "";
        for (int i = 0; i < input.length(); i++) {
                if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                    longestPalindrome = getPalindrome(input, i, i + 1, longestPalindrome);
                }
                longestPalindrome = getPalindrome(input, i, i, longestPalindrome);
        }
        return longestPalindrome;
    }

    private static String getPalindrome(String input, int j, int k, String longestPalindrom) {
        while (j > 0 && k < input.length() - 1 && input.charAt(j - 1) == input.charAt(k + 1)) {
            j--;
            k++;
        }
        String palindrom = input.substring(j, k + 1);
        if (palindrom.length() > longestPalindrom.length()) {
            longestPalindrom = palindrom;
        }
        return longestPalindrom;
    }
}
