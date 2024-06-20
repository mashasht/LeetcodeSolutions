import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ContainsDuplicate2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicate2Test {
    ContainsDuplicate2 containsDuplicate2;
    @BeforeEach
    void setUp() {
        containsDuplicate2 = new ContainsDuplicate2();
    }

    @Test
    void containsNearbyDuplicate_k3_true(){
        assertTrue(containsDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    void containsNearbyDuplicate_k1_true(){
        assertTrue(containsDuplicate2.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    void containsNearbyDuplicate_k2_false(){
        assertFalse(containsDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
