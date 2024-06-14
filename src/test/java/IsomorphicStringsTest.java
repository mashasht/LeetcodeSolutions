import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.IsomorphicStrings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsTest {
    IsomorphicStrings isomorphicStrings;

    @BeforeEach
    void setUp(){
        isomorphicStrings = new IsomorphicStrings();
    }

    @Test
    void isIsomorphic_foobar(){
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    void isIsomorphic_badcbaba(){
        assertFalse(isomorphicStrings.isIsomorphic("badc", "baba"));
    }

    @Test
    void isIsomorphic_aaeaa_uuxyy(){
        assertFalse(isomorphicStrings.isIsomorphic("aaeaa", "uuxyy"));
    }

    @Test
    void isIsomorphic_egg_add(){
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
    }
}
