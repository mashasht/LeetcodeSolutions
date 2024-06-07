import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LongestPalindromicSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void setUp() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindromicSubstring_fourChars_returnsThreeChars() {
        assertEquals("bab", longestPalindromicSubstring.findLongestPalindromicString("babad"));
    }

    @Test
    void longestPalindromicSubstring_threeChars_returnsTwoChars() {
        assertEquals("bb", longestPalindromicSubstring.findLongestPalindromicString("cbbd"));
    }

    @Test
    void longestPalindromicSubstring_sevenChars_returnsSevenChars() {
        assertEquals("abababa", longestPalindromicSubstring.findLongestPalindromicString("abababa"));
    }

    @Test
    void longestPalindromicSubstring_nineChars_returnsSevenChars() {
        assertEquals("abababa", longestPalindromicSubstring.findLongestPalindromicString("labababak"));
    }

    @Test
    void longestPalindromicSubstring_oneChar_returnsOneChars() {
        assertEquals("a", longestPalindromicSubstring.findLongestPalindromicString("a"));
    }

    @Test
    void longestPalindromicSubstring_threeChars_returnsThreeChars() {
        assertEquals("ccc", longestPalindromicSubstring.findLongestPalindromicString("ccc"));
    }
}
