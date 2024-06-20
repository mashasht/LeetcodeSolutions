import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.FindFirstAndLastPosition;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FirstAndLastPositionTest {
    FindFirstAndLastPosition firstAndLastPosition;

    @BeforeEach
    void setUp(){
        firstAndLastPosition = new FindFirstAndLastPosition();
    }

    @Test
    void searchRange_eightElements_findsRangeOfTwo(){
        assertArrayEquals(new int[]{3, 4}, firstAndLastPosition.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
}
