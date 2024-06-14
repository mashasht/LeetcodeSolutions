package org.leetcode.solutions;

public class ExcelTitleToNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += columnTitle.charAt(i) - 64;
        }
        return result;
    }
}
