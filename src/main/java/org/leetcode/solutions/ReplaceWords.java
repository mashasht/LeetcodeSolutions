package org.leetcode.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dictSet = new HashSet<>(dictionary);
        StringBuilder currentWord = new StringBuilder();
        StringBuilder finalSentence = new StringBuilder();
        int i = 0;
        while (i < sentence.length()) {
            if (!Character.isSpaceChar(sentence.charAt(i))) {
               currentWord.append(sentence.charAt(i));
            }
            if (dictSet.contains(currentWord.toString())) {
                while (i < sentence.length() - 1 && !Character.isSpaceChar(sentence.charAt(i))) {
                    i++;
                }

            }
            if (i == sentence.length() - 1 || Character.isSpaceChar(sentence.charAt(i))) {
                finalSentence.append(currentWord);
                currentWord = new StringBuilder();
                if (i != sentence.length() - 1) {
                    finalSentence.append(" ");
                }
            }
            i++;
        }
        return finalSentence.toString();
    }
}
