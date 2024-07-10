import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MinimumWindowSubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringTest {
    MinimumWindowSubstring minimumWindowSubstring;

    @BeforeEach
    void setUp(){
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @Test
    void minWindow_ABC(){
        assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow_a(){
        assertEquals("a", minimumWindowSubstring.minWindow("a", "a"));
    }

    @Test
    void minWindow_aa(){
        assertEquals("", minimumWindowSubstring.minWindow("a", "aa"));
    }

    @Test
    void minWindow_ab(){
        assertEquals("b", minimumWindowSubstring.minWindow("ab", "b"));
    }

    @Test
    void minWindow_abcdd(){
        assertEquals("abbbbbcdd", minimumWindowSubstring.minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd"));
    }

}
