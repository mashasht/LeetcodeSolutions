package org.leetcode.solutions;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        if (s.length() <= 2) {
            return s.length();
        }
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            chars.put(current, chars.getOrDefault(current, 0) + 1);
            while(chars.size() > 2) {
                char remove = s.charAt(left);
                int numOfOcc = chars.getOrDefault(remove, 0);
                if (numOfOcc > 1) {
                    chars.put(remove, chars.getOrDefault(remove, 0) - 1);
                }
                else {
                    chars.remove(remove);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
