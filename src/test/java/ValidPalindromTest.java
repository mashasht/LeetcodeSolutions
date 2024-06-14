import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ValidPalindrom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromTest {
   ValidPalindrom validPalindrom;

   @BeforeEach
    void setUp(){
       validPalindrom = new ValidPalindrom();
   }

   @Test
   void isPalindrom_panama_positive(){
       assertTrue(validPalindrom.isPalindrome("A man, a plan, a canal: Panama"));
   }

    @Test
    void isPalindrom_race_negative(){
        assertFalse(validPalindrom.isPalindrome("race a car"));
    }

    @Test
    void isPalindrom_empty_positive(){
        assertTrue(validPalindrom.isPalindrome(" "));
    }
}
