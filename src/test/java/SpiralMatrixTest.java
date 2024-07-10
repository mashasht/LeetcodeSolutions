import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SpiralMatrix;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiralMatrixTest {
    SpiralMatrix spiralMatrix;

    @BeforeEach
    void setUp() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    void spiralOrder_1234(){
        assertEquals(List.of(1,2,3,6,9,8,7,4,5), spiralMatrix.spiralOrder(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }

    @Test
    void spiralOrder_9101112(){
        assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7), spiralMatrix.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
