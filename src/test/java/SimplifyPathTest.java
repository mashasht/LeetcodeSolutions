import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.SimplifyPath;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {
    SimplifyPath simplifyPath;
    @BeforeEach
    void setUp(){
        simplifyPath = new SimplifyPath();
    }

    @Test
    void simplifyPath_home(){
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
    }

    @Test
    void simplifyPath_home_foo(){
        assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
    }

    @Test
    void simplifyPath_pictures(){
        assertEquals("/home/user/Pictures", simplifyPath.simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    void simplifyPath_back(){
        assertEquals("/", simplifyPath.simplifyPath("/../"));
    }

    @Test
    void simplifyPath_abc(){
        assertEquals("/.../b/d", simplifyPath.simplifyPath("/.../a/../b/c/../d/./"));
    }

    @Test
    void simplifyPath_c(){
        assertEquals("/c", simplifyPath.simplifyPath("/a/./b/../../c/"));
    }
}
