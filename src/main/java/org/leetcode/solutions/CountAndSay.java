package org.leetcode.solutions;
// TODO: rewrite without recursion
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String prevResult = countAndSay(n - 1);
        char[] prevCharArr = prevResult .toCharArray();
        StringBuilder result = new StringBuilder();
        int charCounter = 1;
        char prevChar = prevCharArr[0];
        for (int i = 1; i < prevCharArr.length; i++) {
            if (prevCharArr[i] == prevChar) {
                charCounter++;
                continue;
            }
            result.append(charCounter);
            result.append(prevChar);
            charCounter = 1;
            prevChar = prevCharArr[i];
        }
        result.append(charCounter);
        result.append(prevChar);
        return result.toString();
    }
}
