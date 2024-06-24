import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MaxConsecutiveOnes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {
    MaxConsecutiveOnes maxConsecutiveOnes;

    @BeforeEach
    void setUp(){
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    void findMaxConsecutiveOnes_3(){
        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
