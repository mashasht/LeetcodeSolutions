package org.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> results = new HashSet<>();
        int mult = 0;
        while(true) {
            while (n > 0) {
                mult += (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (mult == 1) {
                return true;
            }
            if (results.contains(mult)) {
                return false;
            }
            results.add(mult);
            n = mult;
            mult = 0;
        }
    }
}
