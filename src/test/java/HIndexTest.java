import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.HIndex;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HIndexTest {
    HIndex hIndex;

    @BeforeEach
    void setUp() {
        hIndex = new HIndex();
    }

    @Test
    void hIndex_3(){
        assertEquals(3, hIndex.hIndex(new int[]{3,0,6,1,5}));
    }

    @Test
    void hIndex_1(){
        assertEquals(1, hIndex.hIndex(new int[]{1,3,1}));
    }

    @Test
    void hIndex_2(){
        assertEquals(2, hIndex.hIndex(new int[]{4,4,0,0}));
    }
}
