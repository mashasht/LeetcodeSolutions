package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mappings = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (!mappings.containsKey(pattern.charAt(i))) {
                mappings.put(pattern.charAt(i), words[i]);
                continue;
            }
            if (!mappings.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }
       return true;
    }
}
