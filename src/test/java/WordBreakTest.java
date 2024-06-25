import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.WordBreak;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {
    WordBreak wordBreak;
    @BeforeEach
    void setUp(){
        wordBreak = new WordBreak();
    }

    @Test
    void wordBreak_leetcode() {
        assertTrue(wordBreak.wordBreak("leetcode", List.of("leet","code")));
    }

    @Test
    void wordBreak_applepen() {
        assertTrue(wordBreak.wordBreak("applepenapple", List.of("apple","pen")));
    }

    @Test
    void wordBreak_catsandog() {
        assertFalse(wordBreak.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

    @Test
    void wordBreak_aaaaaaa() {
        assertTrue(wordBreak.wordBreak("aaaaaaa", List.of("aaaa","aaa")));
    }
}
