import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SquareRoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootTest {
    SquareRoot squareRoot;

    @BeforeEach
    void setUp() {
        squareRoot = new SquareRoot();
    }

    @Test
    void squareRoot_four_returnsTwo() {
        assertEquals(2, squareRoot.mySqrt(4));
    }

    @Test
    void squareRoot_eight_returnsTwo() {
        assertEquals(2, squareRoot.mySqrt(8));
    }

    @Test
    void squareRoot_one_returnsOne() {
        assertEquals(1, squareRoot.mySqrt(1));
    }

    @Test
    void squareRoot_zero_returnsZero() {
        assertEquals(0, squareRoot.mySqrt(0));
    }

    @Test
    void squareRoot_bigNumber_doesntOverflow() {
        assertEquals(46339, squareRoot.mySqrt(2147395599));
    }
}
