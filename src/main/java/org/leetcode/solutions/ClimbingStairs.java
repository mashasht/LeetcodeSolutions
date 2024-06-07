package org.leetcode.solutions;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int previous = 1;
        int beforePrevious = 1;
        int current = 1;
       for (int i = 2; i <= n; i++) {
           current = beforePrevious + previous;
           beforePrevious = previous;
           previous = current;
       }
       return current;
    }
}
