import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LongestIncreasingSubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence longestIncreasingSubsequence;

    @BeforeEach
    void setUp(){
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    void lengthOfLIS_101(){
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    void lengthOfLIS_323(){
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }
}
