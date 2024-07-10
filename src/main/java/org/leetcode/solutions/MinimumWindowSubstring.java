package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        Map<Character, Integer> charMappings = new HashMap<>();
        for (char ch: t.toCharArray()) {
            charMappings.put(ch, charMappings.getOrDefault(ch, 0) + 1);
        }
        String minimumWindow = s;
        int left = 0;
        Map<Character, Integer> checkMappings = new HashMap<>();
        int charCount = 0;
        boolean thereIsMatch = false;
        while (left < s.length() && !charMappings.containsKey(s.charAt(left))){
            left++;
        }
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charMappings.containsKey(currentChar)) {
                checkMappings.put(currentChar, checkMappings.getOrDefault(currentChar, 0) + 1);
                charCount++;
            }
            if (charCount == t.length()) {
                if (checkMaps(checkMappings, charMappings)) {
                    thereIsMatch = true;
                    minimumWindow = minimumWindow.length() > i - left ? s.substring(left, i + 1) : minimumWindow;
                }
                int leftOcc = checkMappings.getOrDefault(s.charAt(left), 0);
                if (leftOcc != 0) {
                    if (leftOcc == 1) {
                        checkMappings.remove(s.charAt(left));
                    } else {
                        checkMappings.put(s.charAt(left), leftOcc - 1);
                    }
                }
                charCount--;
                do {
                    left++;
                } while (left < s.length() && !charMappings.containsKey(s.charAt(left)));
            }
        }
        return thereIsMatch ? minimumWindow : "";
    }

    private boolean checkMaps(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
        if (!sMap.keySet().equals(tMap.keySet())) {
            return false;
        }
        for (Character tKey: tMap.keySet()) {
            if (tMap.getOrDefault(tKey, 0) > sMap.get(tKey)) {
                return false;
            }
        }
        return true;
    }
}
