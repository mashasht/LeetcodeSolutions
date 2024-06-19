import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SearchInRotatedSortedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray searchInRotatedSortedArray;

    @BeforeEach
    void setUp(){
        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }

    @Test
    void search_sevenElements_returnsFour(){
        assertEquals(4, searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    void search_sevenElements_returnsZero(){
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{0,1,2,4,5,6,7}, 0));
    }

    @Test
    void search_sevenElements_returnsSeven(){
        assertEquals(6, searchInRotatedSortedArray.search(new int[]{0,1,2,4,5,6,7}, 7));
    }
    @Test
    void search_sevenElements_returnsMinusOne(){
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
    @Test
    void search_eightElements_returnsOne(){
        assertEquals(1, searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2,3}, 5));
    }
}
