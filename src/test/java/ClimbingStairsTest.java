import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ClimbingStairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp(){
        climbingStairs = new ClimbingStairs();
    }

    @Test
    void climbStairs_twoWays(){
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void climbStairs_threeWays(){
        assertEquals(3, climbingStairs.climbStairs(3));
    }
}
