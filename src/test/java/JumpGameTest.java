
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.JumpGame;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameTest {
    JumpGame jumpGame;
    @BeforeEach
    void setup() {
        jumpGame = new JumpGame();
    }

    @Test
    void canJump_hasSolution(){
        assertTrue(jumpGame.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    void canJump_hasNoSolution(){
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void canJump_hasSolution2(){
        assertTrue(jumpGame.canJump(new int[]{2,5,0,0}));
    }

}
