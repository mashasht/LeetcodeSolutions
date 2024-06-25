import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.BuyAndSellStock2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyAndSellStock2Test {
    BuyAndSellStock2 buyAndSellStock2;

    @BeforeEach
    void setUp(){
        buyAndSellStock2 = new BuyAndSellStock2();
    }

    @Test
    void maxProfit_7() {
        assertEquals(7, buyAndSellStock2.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfit_4() {
        assertEquals(4, buyAndSellStock2.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    void maxProfit_0() {
        assertEquals(0, buyAndSellStock2.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    void maxProfit_7_2() {
        assertEquals(7, buyAndSellStock2.maxProfit(new int[]{6,1,3,2,4,7}));
    }
}
