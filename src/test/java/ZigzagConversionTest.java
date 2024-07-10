import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ZigzagConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversionTest {
    ZigzagConversion zigzagConversion;

    @BeforeEach
    void setUp(){
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    void convert_3(){
        assertEquals("PAHNAPLSIIGYIR", zigzagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    void convert_4(){
        assertEquals("PINALSIGYAHRPI", zigzagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    void convert_1(){
        assertEquals("A", zigzagConversion.convert("A", 1));
    }
}
