import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MinimumSubarraySum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSubarraySumTest {
    MinimumSubarraySum minimumSubarraySum;

    @BeforeEach
    void setUp(){
        minimumSubarraySum = new MinimumSubarraySum();
    }

    @Test
    void minSubArrayLen_8(){
        assertEquals(8, minimumSubarraySum.minSubArrayLen(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
