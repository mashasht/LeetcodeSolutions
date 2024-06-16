package org.leetcode.solutions;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null) {
            return 0;
        }
       int[] letterCounter = new int[128];
       for (int i = 0; i < s.length(); i++) {
           letterCounter[s.charAt(i)]++;
       }
       int palindromeLength = 0;
       boolean charactersLeft = false;
       for (int i = 0; i < letterCounter.length; i++) {
           if (letterCounter[i] % 2 == 0) {
               palindromeLength += letterCounter[i];
               continue;
           }
           palindromeLength += letterCounter[i] - 1;
           charactersLeft = true;
       }
       if (charactersLeft) {
           palindromeLength++;
       }
       return palindromeLength;
    }
}
