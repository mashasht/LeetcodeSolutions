package org.leetcode.solutions;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String noDashes = s.replace("-", "");
        String upperCase = noDashes.toUpperCase();
        if (upperCase.length() <= k) {
            return upperCase;
        }
        StringBuilder result = new StringBuilder();
        int index = upperCase.length() % k;
        if (index != 0) {
            result.append(upperCase, 0, index);
            result.append("-");
        }
        while(index <= upperCase.length() - k) {
            result.append(upperCase, index, index + k);
            if (index != upperCase.length() - k) {
                result.append("-");
            }
            index += k;
        }
        return result.toString();
    }
}
