package org.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> flip = new HashMap<>();
        flip.put('0','0');
        flip.put('6','9');
        flip.put('9','6');
        flip.put('8','8');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if (!flip.containsKey(num.charAt(i))) {
                return false;
            }
            result.append(flip.get(num.charAt(i)));
        }
        return result.toString().equals(num);
    }
}
