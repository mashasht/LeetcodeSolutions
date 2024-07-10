import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ThreeSum;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {
    ThreeSum threeSum;

    @BeforeEach
    void setUp(){
        threeSum = new ThreeSum();
    }

    @Test
    void threeSum_two(){
        assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    void threeSum_empty(){
        assertEquals(List.of(), threeSum.threeSum(new int[]{0,1,1}));
    }


    @Test
    void threeSum_one(){
        assertEquals(List.of(List.of(0,0,0)), threeSum.threeSum(new int[]{0,0,0}));
    }

    @Test
    void threeSum_zeros(){
        assertEquals(List.of(List.of(0,0,0)), threeSum.threeSum(new int[]{0,0,0,0}));
    }
}
