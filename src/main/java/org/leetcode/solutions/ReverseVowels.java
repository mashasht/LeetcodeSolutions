package org.leetcode.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && vowels.contains(charArr[left])) {
                left++;
            }
            while (left < right && vowels.contains(charArr[right])) {
                right--;
            }
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
        }
        return new String(charArr);
    }
}
