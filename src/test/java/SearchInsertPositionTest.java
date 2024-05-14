import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SearchInsertPosition;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void searchInsertPosition_numberExists_returnsIndex() {
        assertEquals(2, searchInsertPosition.searchInsertPosition(new int[]{1,3,5,6}, 5));
    }

    @Test
    void searchInsertPosition_numberDoesntExist_returnsIndex() {
        assertEquals(1, searchInsertPosition.searchInsertPosition(new int[]{1,3,5,6}, 2));
    }

    @Test
    void searchInsertPosition_numberDoesntExist_returnsLastIndex() {
        assertEquals(4, searchInsertPosition.searchInsertPosition(new int[]{1,3,5,6}, 7));
    }
    @Test
    void searchInsertPosition_numberDoesntExist_returnsLastPlusOneIndex() {
        assertEquals(1, searchInsertPosition.searchInsertPosition(new int[]{1}, 2));
    }
}
