import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.PlusOne;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    PlusOne plusOne;

    @BeforeEach
    void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    void plusOne_threeElements_returnsSameArrayPlusOne() {
        assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(new int[]{1,2,3}));
    }


    @Test
    void plusOne_fourElements_returnsSameArrayPlusOne() {
        assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    void plusOne_oneElement_returnsTwoElements() {
        assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }

    @Test
    void plusOne_threeElements_returnsFourElements() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9}));
    }
}
