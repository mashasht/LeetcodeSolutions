import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ReplaceWords;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceWordsTest {
    ReplaceWords replaceWords;

    @BeforeEach
    void setUp(){
        replaceWords = new ReplaceWords();
    }

    @Test
    void replaceWords_cattle(){
        List<String> dict = new LinkedList<>();
        dict.add("cat");
        dict.add("bat");
        dict.add("rat");
        assertEquals("the cat was rat by the bat", replaceWords.replaceWords(dict, "the cattle was rattled by the battery"));
    }
}
