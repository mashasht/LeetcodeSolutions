import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.AddBinary;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    AddBinary addBinary;

    @BeforeEach
    void setUp(){
       addBinary = new AddBinary();
    }

    @Test
    void addBinary_threePlusOne(){
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    void addBinary_fivePlusOne(){
        assertEquals("110", addBinary.addBinary("101", "1"));
    }
}
