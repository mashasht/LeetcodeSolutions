import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.RotateImage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {
    RotateImage rotateImage;

    @BeforeEach
    void setUp() {
        rotateImage = new RotateImage();
    }

    @Test
    void rotateImage_123(){
        int[][] result = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(result);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, result);
    }
}
