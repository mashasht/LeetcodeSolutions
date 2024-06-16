import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ReverseInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger;

    @BeforeEach
    void setUp(){
        reverseInteger = new ReverseInteger();
    }

    @Test
    void reverseInteger_overflow(){
        assertEquals(0, reverseInteger.reverse(1534236469));
    }

    @Test
    void reverseInteger_no_overflow(){
        assertEquals(2147483641, reverseInteger.reverse(1463847412));
    }

    @Test
    void reverseInteger_negative_nooverflow(){
        assertEquals(-321, reverseInteger.reverse(-123));
    }
}
