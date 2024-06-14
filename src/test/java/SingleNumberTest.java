import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SingleNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    SingleNumber singleNumber;

    @BeforeEach
    void setUp(){
        singleNumber = new SingleNumber();
    }

    @Test
    void singleNumber_returnFour(){
        assertEquals(4, singleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }
}
