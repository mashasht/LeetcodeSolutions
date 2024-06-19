import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.LetterCombinationsOfPhoneNumber;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LetterCombinationsOfPhoneNumberTest {
    LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber;

    @BeforeEach
    void setUp(){
        letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
    }

    @Test
    void letterCombinations_23(){
        assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"),
                letterCombinationsOfPhoneNumber.letterCombinations("23"));
    }

    @Test
    void letterCombinations_empty(){
        assertTrue(letterCombinationsOfPhoneNumber.letterCombinations("").isEmpty());
    }

    @Test
    void letterCombinations_2(){
        assertEquals(List.of("a","b","c"),
                letterCombinationsOfPhoneNumber.letterCombinations("2"));
    }
}
