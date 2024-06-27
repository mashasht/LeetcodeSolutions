package org.leetcode.solutions;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupStrings = new HashMap<>();
        for (String str : strs) {
            char[] anagramChars = str.toCharArray();
            Arrays.sort(anagramChars);
            String keyStr = Arrays.toString(anagramChars);
            if (!groupStrings.containsKey(keyStr)) {
                groupStrings.put(keyStr, new LinkedList<>());
            }
            groupStrings.get(keyStr).add(str);
        }
        return new ArrayList<>(groupStrings.values());
    }
}
