import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.CoinChange;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {
    CoinChange coinChange;

    @BeforeEach
    void setUp() {
        coinChange = new CoinChange();
    }

    @Test
    void coinChange_11() {
        assertEquals(3, coinChange.coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    void coinChange_3() {
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
    }

    @Test
    void coinChange_0() {
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }

}
