import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.AddDigits;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {
    AddDigits addDigits;

    @BeforeEach
    void setUp(){
        addDigits = new AddDigits();
    }

    @Test
    void addDigits_38(){
        assertEquals(2, addDigits.addDigits(38));
    }
}
