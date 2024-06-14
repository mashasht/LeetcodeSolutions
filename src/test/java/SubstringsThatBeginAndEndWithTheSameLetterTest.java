import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SubstringsThatBeginAndEndWithTheSameLetter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringsThatBeginAndEndWithTheSameLetterTest {
    SubstringsThatBeginAndEndWithTheSameLetter substrings;

    @BeforeEach
    void setUp(){
        substrings = new SubstringsThatBeginAndEndWithTheSameLetter();
    }

    @Test
    void numberOfSubstrings_seven(){
        assertEquals(7, substrings.numberOfSubstrings("abcba"));
    }

    @Test
    void numberOfSubstrings_nine(){
        assertEquals(9, substrings.numberOfSubstrings("abacad"));
    }
}
