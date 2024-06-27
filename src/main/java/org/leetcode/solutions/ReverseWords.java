package org.leetcode.solutions;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = strArr.length - 1; i > 0; i--) {
            result.append(strArr[i]);
            result.append(" ");
        }
        result.append(strArr[0]);
        return result.toString();
    }
}
