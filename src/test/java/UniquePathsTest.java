import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.UniquePaths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();

    @BeforeEach
    void setUp() {
        uniquePaths = new UniquePaths();
    }

    @Test
    void uniquePaths_returnsTwentyEight() {
        assertEquals( 28, uniquePaths.uniquePaths(3, 7));
    }

    @Test
    void uniquePaths_returnsThree() {
        assertEquals( 3, uniquePaths.uniquePaths(3, 2));
    }

    @Test
    void uniquePaths_returns() {
        assertEquals( 10518300, uniquePaths.uniquePaths(25, 9));
    }
}
