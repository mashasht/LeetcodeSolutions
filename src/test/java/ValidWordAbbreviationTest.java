import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ValidWordAbbreviation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidWordAbbreviationTest {
    ValidWordAbbreviation validWordAbbreviation;

    @BeforeEach
    void setUp() {
        validWordAbbreviation = new ValidWordAbbreviation();
    }

    @Test
    void validWordAbbreviation_internatlization_true(){
        assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization", "i12iz4n"));
    }

    @Test
    void validWordAbbreviation_apple_false(){
        assertFalse(validWordAbbreviation.validWordAbbreviation("apple", "a2e"));
    }

    @Test
    void validWordAbbreviation_internatlization2_true(){
        assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization", "i5a11o1"));
    }
}
