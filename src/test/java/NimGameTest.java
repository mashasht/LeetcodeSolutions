import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.NimGame;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NimGameTest {
    NimGame nimGame;

    @BeforeEach
    void setUp() {
        nimGame = new NimGame();
    }

    @Test
    void canWin_Four_False() {
        assertFalse(nimGame.canWinNim(4));
    }

    @Test
    void canWin_Five_True() {
        assertTrue(nimGame.canWinNim(5));
    }

    @Test
    void canWin_Eight_False() {
        assertFalse(nimGame.canWinNim(8));
    }
}
