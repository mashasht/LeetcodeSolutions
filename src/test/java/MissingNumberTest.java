import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MissingNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    MissingNumber missingNumber;

    @BeforeEach
    void setUp(){
        missingNumber = new MissingNumber();
    }

    @Test
    void missingNumber_three_twoMissing(){
        assertEquals(2, missingNumber.missingNumber(new int[]{3, 0, 1}));
    }
}
