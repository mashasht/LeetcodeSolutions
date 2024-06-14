package org.leetcode.solutions;
// TODO: review later
public class SubstringsThatBeginAndEndWithTheSameLetter {
    public long numberOfSubstrings(String s) {
        int[] arr = new int[26];
        long sum = 0;
        for(int i=0; i < s.length(); i++){
            int val = s.charAt(i) - 97;
            arr[val] += 1;
            sum += arr[val];
        }
        return sum;
    }
}
