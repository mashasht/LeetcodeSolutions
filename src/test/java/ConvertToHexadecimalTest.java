import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ConvertToHexadecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToHexadecimalTest {
    ConvertToHexadecimal convertToHexadecimal;

    @BeforeEach
    void setUp(){
        convertToHexadecimal = new ConvertToHexadecimal();
    }

    @Test
    void toHex_26_1a(){
        assertEquals("1a", convertToHexadecimal.toHex(26));
    }

    @Test
    void toHex_negative_ffffffff(){
        assertEquals("ffffffff", convertToHexadecimal.toHex(-1));
    }
}
