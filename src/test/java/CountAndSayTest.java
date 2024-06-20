import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.CountAndSay;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAndSayTest {
    CountAndSay countAndSay;

    @BeforeEach
    void setUp() {
        countAndSay = new CountAndSay();
    }

    @Test
    void countAndSay_four(){
        assertEquals("1211", countAndSay.countAndSay(4));
    }

    @Test
    void countAndSay_five(){
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}
