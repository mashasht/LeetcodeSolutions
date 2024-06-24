import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.TeemoAttacking;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeemoAttackingTest {
    TeemoAttacking teemoAttacking;

    @BeforeEach
    void setUp(){
        teemoAttacking = new TeemoAttacking();
    }

    @Test
    void findPoisonedDuration_oneFour(){
        assertEquals(4, teemoAttacking.findPoisonedDuration(new int[]{1, 4}, 2));
    }
}
