import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MoveZeroes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {
    MoveZeroes moveZeroes;

    @BeforeEach
    void setUp(){
        moveZeroes = new MoveZeroes();
    }

    @Test
    void moveZeroes_fiveElements_twoZeros(){
        int[] inputArray = new int[]{0,1,0,3,12};
        moveZeroes.moveZeroes(inputArray);
        assertArrayEquals(new int[]{1,3,12,0,0}, inputArray);
    }
}
