import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MaxSubArray;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSubArrayTest {
    MaxSubArray maxSubArray;

    @BeforeEach
    void setUp() {
        maxSubArray = new MaxSubArray();
    }

    @Test
    void maxSubArray_hasPositiveSubarray_returnsSum() {
        assertEquals(6, maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void maxSubArray_hasNegativeSubarray_returnsSum() {
        assertEquals(-1, maxSubArray.maxSubArray(new int[]{-2, -1}));
    }

}
