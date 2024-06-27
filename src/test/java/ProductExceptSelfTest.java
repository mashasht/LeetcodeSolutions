import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ProductExceptSelf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductExceptSelfTest {
    ProductExceptSelf productExceptSelf;

    @BeforeEach
    void setUp(){
        productExceptSelf = new ProductExceptSelf();
    }

    @Test
    void productExceptSelf_1234(){
        assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    void productExceptSelf_negative(){
        assertArrayEquals(new int[]{0,0,9,0,0}, productExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}
