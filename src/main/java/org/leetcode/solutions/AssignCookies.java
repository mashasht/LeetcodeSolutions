package org.leetcode.solutions;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = g.length - 1;
        int contentCounter = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] >= g[gIndex]) {
                contentCounter++;
                gIndex--;
            }
        }
        return contentCounter;
    }
}
