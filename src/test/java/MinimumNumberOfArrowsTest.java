import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MinimumNumberOfArrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfArrowsTest {
    MinimumNumberOfArrows minimumNumberOfArrows;

    @BeforeEach
    void setUp() {
        minimumNumberOfArrows = new MinimumNumberOfArrows();
    }

    @Test
    void findMinArrowShots_2(){
        assertEquals(2, minimumNumberOfArrows.findMinArrowShots(new int[][]{{1, 5}, {2, 3}, {5, 8}}));
    }

    @Test
    void findMinArrowShots_22(){
        assertEquals(2, minimumNumberOfArrows.findMinArrowShots(new int[][]{{1, 5}, {2, 3}, {2, 3}, {5, 8}, {5, 7}, {6, 7}}));
    }
}
