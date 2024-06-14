import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.PowerOfThree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfThreeTest {
    PowerOfThree powerOfThree;

    @BeforeEach
    void setUp(){
        powerOfThree = new PowerOfThree();
    }

    @Test
    void isPowerOfThree_negative_false(){
        assertFalse(powerOfThree.isPowerOfThree(-1));
    }

    @Test
    void isPowerOfThree_twentyseven_true(){
        assertTrue(powerOfThree.isPowerOfThree(27));
    }
}
