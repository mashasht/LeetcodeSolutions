import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LengthOfTheLastWord;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfTheLastWordTest {
    LengthOfTheLastWord lengthOfTheLastWord;

    @BeforeEach
    void setUp() {
        lengthOfTheLastWord = new LengthOfTheLastWord();
    }

    @Test
    void lengthOfTheLastWord_returnsFive() {
        assertEquals(5, lengthOfTheLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfTheLastWord_returnsFour() {
        assertEquals(4, lengthOfTheLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfTheLastWord_returnsSix() {
        assertEquals(6, lengthOfTheLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    void lengthOfTheLastWord_returnsZero() {
        assertEquals(0, lengthOfTheLastWord.lengthOfLastWord("    "));
    }



}
