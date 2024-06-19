package org.leetcode.solutions;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
// TODO: rewrite using StringBuilder
public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        result.add("");
        char[] digitsChar = digits.toCharArray();
        for (char dig: digitsChar) {
            result = addLetterCombination(result, dig - '0');
        }
        return result;
    }

    private static List<String> addLetterCombination(List<String> previousResult, int digit) {
        List<String> result = new LinkedList<>();
        final Map<Integer, String> mappings = new HashMap<>();
        mappings.put(2, "abc");
        mappings.put(3, "def");
        mappings.put(4, "ghi");
        mappings.put(5, "jkl");
        mappings.put(6, "mno");
        mappings.put(7, "pqrs");
        mappings.put(8, "tuv");
        mappings.put(9, "wxyz");
        for (String sequence: previousResult ) {
            String mapping = mappings.get(digit);
            for (int i = 0; i < mapping.length(); i++) {
                result.add(sequence + mapping.charAt(i));
            }
        }
        return result;
    }
}
