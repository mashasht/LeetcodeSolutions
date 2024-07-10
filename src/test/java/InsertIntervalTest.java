import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.InsertInterval;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertIntervalTest {
    InsertInterval insertInterval;
    @BeforeEach
    void setUp() {
        insertInterval = new InsertInterval();
    }

    @Test
    void insert_2elements(){
        assertArrayEquals(new int[][]{{1,5},{6,9}}, insertInterval.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));
    }

    @Test
    void insert_5elements(){
        assertArrayEquals(new int[][]{{1,2},{3,10},{12,16}}, insertInterval.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));
    }

    @Test
    void insert_1element(){
        assertArrayEquals(new int[][]{{1,5}}, insertInterval.insert(new int[][]{{1,5}}, new int[]{2,3}));
    }
}
