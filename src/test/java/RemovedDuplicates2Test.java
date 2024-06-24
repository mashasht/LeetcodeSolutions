import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.RemoveDuplicates2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovedDuplicates2Test {
    RemoveDuplicates2 removeDuplicates2;

    @BeforeEach
    void setUp(){
        removeDuplicates2 = new RemoveDuplicates2();
    }

    @Test
    void removeDuplicates_oneTwoThree(){
        assertEquals(5, removeDuplicates2.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    @Test
    void removeDuplicates_zeroOneTwo(){
        assertEquals(7, removeDuplicates2.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}
