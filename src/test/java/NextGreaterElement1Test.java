import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.NextGreaterElement1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElement1Test {
    NextGreaterElement1 nextGreaterElement1;

    @BeforeEach
    void setUp() {
        nextGreaterElement1 = new NextGreaterElement1();
    }

    @Test
    void nextGreaterElement_412(){
        assertArrayEquals(new int[]{-1,3,-1}, nextGreaterElement1.nextGreaterElement(new int[]{4,1,2},
                new int[]{1,3,4,2}));
    }
}
