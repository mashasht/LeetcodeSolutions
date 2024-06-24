import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ConstructTheRectangle;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConstructTheRectangleTest {
    ConstructTheRectangle constructTheRectangle;
    @BeforeEach
    void setUp(){
        constructTheRectangle = new ConstructTheRectangle();
    }

    @Test
    void constructRectangle_4(){
        assertArrayEquals(new int[]{2, 2}, constructTheRectangle.constructRectangle(4));
    }

    @Test
    void constructRectangle_37(){
        assertArrayEquals(new int[]{37, 1}, constructTheRectangle.constructRectangle(37));
    }

    @Test
    void constructRectangle_122122(){
        assertArrayEquals(new int[]{427, 286}, constructTheRectangle.constructRectangle(122122));
    }
}
