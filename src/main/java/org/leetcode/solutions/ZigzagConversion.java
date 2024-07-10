package org.leetcode.solutions;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[][] result = new char[numRows][s.length()];
        int i = 0;
        int column = 0;
        int row = 0;
        while (i < s.length()) {
            while(i < s.length() && row < numRows) {
                result[row++][column] = s.charAt(i++);
            }
            row = numRows - 2;
            column++;
            while(i < s.length() && row > 0) {
                result[row--][column++] = s.charAt(i++);
            }
        }
        StringBuilder resultSb = new StringBuilder();
        for (char[] chars : result) {
            for (char aChar : chars) {
                if (aChar != 0) {
                    resultSb.append(aChar);
                }
            }
        }
        return resultSb.toString();
    }
}
