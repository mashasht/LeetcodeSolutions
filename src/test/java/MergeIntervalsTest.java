import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MergeIntervals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {
    MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp(){
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void merge_3(){
        assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, mergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
    }
}
