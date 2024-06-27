import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.TrappingRainWater;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {
    TrappingRainWater trappingRainWater;

    @BeforeEach
    void setUp(){
        trappingRainWater = new TrappingRainWater();
    }

    @Test
    void trap_6(){
        assertEquals(6, trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    @Test
    void trap_9(){
        assertEquals(9, trappingRainWater.trap(new int[]{4,2,0,3,2,5}));
    }
}
