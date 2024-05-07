import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.RemoveElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    void removeElementInPlace_twoElements_returnsOne() {
        assertEquals(1, removeElement.removeElementInPlace(new int[]{4, 5}, 4));
    }

    @Test
    void removeElementInPlace_eightElements_returnsSix() {
        assertEquals(6, removeElement.removeElementInPlace(new int[]{1, 5, 4, 5, 8, 6, 11, 3}, 5));
    }

    @Test
    void removeElementInPlace_lastElements_returnsThree() {
        assertEquals(3, removeElement.removeElementInPlace(new int[]{1, 4, 8, 5, 5}, 5));
    }

    @Test
    void removeElementInPlace_firstElements_returnsThree() {
        assertEquals(3, removeElement.removeElementInPlace(new int[]{5, 5, 1, 4, 8}, 5));
    }


}
