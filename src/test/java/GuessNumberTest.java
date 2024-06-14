import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.GuessNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    GuessNumber guessNumber;

    @BeforeEach
    void setUp() {
        guessNumber = new GuessNumber();
    }

    @Test
    void guessNumber_pick6_n10(){
        guessNumber.pick = 6;
        assertEquals(6, guessNumber.guessNumber(10));
    }

    @Test
    void guessNumber_pick2_n2(){
        guessNumber.pick = 2;
        assertEquals(2, guessNumber.guessNumber(2));
    }
}
