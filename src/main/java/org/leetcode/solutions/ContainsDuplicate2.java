package org.leetcode.solutions;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> uniqueCharacters = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueCharacters.contains(nums[i])) {
               return true;
            }
            if (i >= k) {
                uniqueCharacters.remove(nums[i - k]);
            }
            uniqueCharacters.add(nums[i]);
        }
        return false;
    }
}
