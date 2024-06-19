import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.DivideTwoIntegers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {
    DivideTwoIntegers divideTwoIntegers;

    @BeforeEach
    void setUp(){
       divideTwoIntegers = new DivideTwoIntegers();
    }

    @Test
    void divide_overflow(){
        assertEquals(2147483647, divideTwoIntegers.divide(-2147483648, -1));
    }

    @Test
    void divide_nooverflow(){
        assertEquals(-2147483648, divideTwoIntegers.divide(-2147483648, 1));
    }
}
