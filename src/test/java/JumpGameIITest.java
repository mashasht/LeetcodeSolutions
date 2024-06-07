import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.JumpGameII;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameIITest {
    JumpGameII jumpGame;

    @BeforeEach
    void setUp() {
        jumpGame = new JumpGameII();
    }

    @Test
    void jump_returnsTwoJumps1() {
        assertEquals( 2, jumpGame.jump(new int[]{2,3,1,1,4}));
    }

    @Test
    void jump_returnsTwoJumps2() {
        assertEquals( 2, jumpGame.jump(new int[]{2,3,0,1,4}));
    }

    @Test
    void jump_returnsOneJump() {
        assertEquals( 1, jumpGame.jump(new int[]{3, 2, 1}));
    }

    @Test
    void jump_returnsTwoJumps3() {
        assertEquals( 2, jumpGame.jump(new int[]{1, 2, 3}));
    }
}
