import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.CombinationSum;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {
    CombinationSum combinationSum;
    @BeforeEach
    void setUp(){
        combinationSum = new CombinationSum();
    }

    @Test
    void combinationSum_seven(){
        List<List<Integer>> result = new LinkedList<>();
        result.add(List.of(2,2,3));
        result.add(List.of(7));
        assertEquals(result, combinationSum.combinationSum(new int[]{2,3,6,7}, 7));
    }
}
