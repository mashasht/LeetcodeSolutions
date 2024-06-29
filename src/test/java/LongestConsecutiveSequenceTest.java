import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LongestConsecutiveSequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeEach
    void setUp(){
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    void longestConsecutive_4(){
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void longestConsecutive_9(){
        assertEquals(9, longestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void longestConsecutive_3(){
        assertEquals(3, longestConsecutiveSequence.longestConsecutive(new int[]{1,2,0,1}));
    }

    @Test
    void longestConsecutive_5(){
        assertEquals(5, longestConsecutiveSequence.longestConsecutive(new int[]{4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3}));
    }
}
