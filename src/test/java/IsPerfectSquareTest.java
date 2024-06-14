import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.IsPerfectSquare;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPerfectSquareTest {
    IsPerfectSquare isPerfectSquare;
    @BeforeEach
    void setUp(){
        isPerfectSquare = new IsPerfectSquare();
    }

    @Test
    void isPerfectSquare_nine_true(){
        assertTrue(isPerfectSquare.isPerfectSquare(9));
    }

    @Test
    void isPerfectSquare_sixteen_true(){
        assertTrue(isPerfectSquare.isPerfectSquare(16));
    }

    @Test
    void isPerfectSquare_hundred_true(){
        assertTrue(isPerfectSquare.isPerfectSquare(100));
    }

    @Test
    void isPerfectSquare_five_false(){
        assertFalse(isPerfectSquare.isPerfectSquare(5));
    }

    @Test
    void isPerfectSquare_seventySix_false(){
        assertFalse(isPerfectSquare.isPerfectSquare(76));
    }

}
