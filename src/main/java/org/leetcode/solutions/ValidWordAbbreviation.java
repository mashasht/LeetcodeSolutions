package org.leetcode.solutions;

public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        int indexWord = 0;
        int indexAbbr = 0;
        while (indexWord < word.length() && indexAbbr < abbr.length()) {
            if (Character.isLetter(abbr.charAt(indexAbbr))) {
                if (abbr.charAt(indexAbbr) != word.charAt(indexWord)) {
                    return false;
                }
                indexWord++;
                indexAbbr++;
                continue;
            }
            int digitStart = indexAbbr;
            while(indexAbbr < abbr.length() && Character.isDigit(abbr.charAt(indexAbbr))) {
                indexAbbr++;
            }
            if (abbr.charAt(digitStart) == '0') {
                return false;
            }
            indexWord += Integer.parseInt(abbr.substring(digitStart, indexAbbr));
        }
        if (indexWord == word.length() && indexAbbr == abbr.length()) {
            return true;
        }
        return false;
    }
}
