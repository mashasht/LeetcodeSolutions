import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LongestCommonSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {
    LongestCommonSubsequence longestCommonSubsequence;

    @BeforeEach
    void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    void longestCommonSubsequence_twoArrays_twoCommon(){
        assertEquals(new ArrayList<>(Arrays.asList(1, 4)),
                longestCommonSubsequence.longestCommonSubsequence(new int[][]{new int[]{1,3,4}, new int[]{1,4,7,9}}));
    }

    @Test
    void longestCommonSubsequence_twoArrays_noneCommon(){
        assertEquals(new ArrayList<>(List.of()),
                longestCommonSubsequence.longestCommonSubsequence(new int[][]{new int[]{1,2,3,4,5}, new int[]{6,7,8}}));
    }

    @Test
    void longestCommonSubsequence_threeArrays_threeCommon(){
        assertEquals(new ArrayList<>(List.of(2,3,6)),
                longestCommonSubsequence.longestCommonSubsequence(new int[][]{new int[]{2,3,6,8},
                        new int[]{1,2,3,5,6,7,10},
                        new int[]{2,3,4,6,9},
                }));
    }

    @Test
    void longestCommonSubsequence_manyArrays_threeCommon(){
        assertEquals(new ArrayList<>(List.of(7)),
                longestCommonSubsequence.longestCommonSubsequence(new int[][]{new int[]{1,2,3,4,5,6,7,9,10},
                        new int[]{1,3,4,5,7,8,9,10},
                        new int[]{1,2,6,7,8,10},
                        new int[]{1,2,3,4,5,6,7,8,9,10},
                        new int[]{2,4,5,6,7,8,9,10},
                        new int[]{2,6,7,8,9},
                }));
    }
}
