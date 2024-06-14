import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.BuyAndSellStock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyAndSellStockTest {
    BuyAndSellStock buyAndSellStock;

    @BeforeEach
    void setUp(){
        buyAndSellStock = new BuyAndSellStock();
    }

    @Test
    void buyAndSellStock_maxProfitFive(){
        assertEquals(5, buyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
