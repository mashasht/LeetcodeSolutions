import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.IntegerToRoman;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    IntegerToRoman integerToRoman;

    @BeforeEach
    void setUp(){
        integerToRoman = new IntegerToRoman();
    }

    @Test
    void intToRoman_3749(){
        assertEquals("MMMDCCXLIX", integerToRoman.intToRoman(3749));
    }

    @Test
    void intToRoman_58(){
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    void intToRoman_1994(){
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }
}
