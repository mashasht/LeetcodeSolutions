import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.HappyNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {
    HappyNumber happyNumber;
    @BeforeEach
    void setUp(){
        happyNumber = new HappyNumber();
    }

    @Test
    void isHappy_19(){
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    void isHappy_2(){
        assertFalse(happyNumber.isHappy(2));
    }
}
