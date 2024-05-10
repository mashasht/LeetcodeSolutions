import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.FindIndexOfFirstOccurence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexOfFirstOccurenceTest {
    FindIndexOfFirstOccurence findIndexOfFirstOccurence;

    @BeforeEach
    void setUp() {
        findIndexOfFirstOccurence = new FindIndexOfFirstOccurence();
    }

    @Test
    void findFirstIndex_twoOccurences_returnsFirst() {
        assertEquals(0, findIndexOfFirstOccurence.findFirstIndex("sadbutsad", "sad"));
    }
    @Test
    void findFirstIndex_noOccurences_returnsNone() {
        assertEquals(-1, findIndexOfFirstOccurence.findFirstIndex("mississippi", "issipi"));
    }

}
