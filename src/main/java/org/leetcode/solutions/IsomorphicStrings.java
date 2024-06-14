package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mappingsStoT = new HashMap<>();
        Map<Character, Character> mappingsTtoS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mappingsStoT.containsKey(s.charAt(i)) && !mappingsTtoS.containsKey(t.charAt(i))) {
                mappingsStoT.put(s.charAt(i), t.charAt(i));
                mappingsTtoS.put(t.charAt(i), s.charAt(i));
            }
            else {
                if (mappingsStoT.containsKey(s.charAt(i)) && mappingsStoT.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
                if (mappingsTtoS.containsKey(t.charAt(i)) && mappingsTtoS.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
