import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.StringToInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {
    StringToInteger stringToInteger;

    @BeforeEach
    void setUp(){
        stringToInteger = new StringToInteger();
    }

    @Test
    void myAtoi_42(){
        assertEquals(42, stringToInteger.myAtoi("42"));
    }

    @Test
    void myAtoi_minus42(){
        assertEquals(-42, stringToInteger.myAtoi("-042"));
    }

    @Test
    void myAtoi_overflow(){
        assertEquals(2147483647, stringToInteger.myAtoi("2147483648"));
    }
}
