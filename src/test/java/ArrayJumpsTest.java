import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ArrayJumps;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArrayJumpsTest {
    ArrayJumps arrayJumps;

    @BeforeEach
    void setUp() {
        arrayJumps = new ArrayJumps();
    }

    @Test
    void hasSolutions_noSolutions_returnsFalse() {
        assertFalse( arrayJumps.hasSolution(new int[]{1,1,1}, 1));
    }

    @Test
    void hasSolutions_hasSolution_returnsTrue() {
        assertTrue(arrayJumps.hasSolution(new int[]{8, 7, 2, 3, 1, 0 , 1}, 2));
    }
}
