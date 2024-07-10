import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LongestSubstringWithAtMostTwoDistinctCharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithAtMostTwoDistinctCharactersTest {
    LongestSubstringWithAtMostTwoDistinctCharacters longestSubstringWithAtMostTwoDistinctCharacters;

    @BeforeEach
    void setUp(){
        longestSubstringWithAtMostTwoDistinctCharacters = new LongestSubstringWithAtMostTwoDistinctCharacters();
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_ece(){
        assertEquals(3, longestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_aabbb(){
        assertEquals(5, longestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }
}
