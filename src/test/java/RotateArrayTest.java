import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.RotateArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {
    RotateArray rotateArray;
    @BeforeEach
    void setUp(){
        rotateArray = new RotateArray();
    }

    @Test
    void rotate_k3(){
        int[] original = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(original, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, original);
    }

    @Test
    void rotate_k2(){
        int[] original = new int[]{-1,-100,3,99};
        rotateArray.rotate(original, 2);
        assertArrayEquals(new int[]{3,99,-1,-100}, original);
    }
}
