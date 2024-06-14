import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.MissingRanges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingRangesTest {
    MissingRanges missingRanges;

    @BeforeEach
    void setUp(){
        missingRanges = new MissingRanges();
    }

    @Test
    void findMissingRanges_returnsFourRanges(){
        List<List<Integer>> result = new LinkedList<>();
        result.add(Arrays.asList(2, 2));
        result.add(Arrays.asList(4, 49));
        result.add(Arrays.asList(51, 74));
        result.add(Arrays.asList(76, 99));
        assertEquals(result, missingRanges.findMissingRanges(new int[]{0,1,3,50,75}, 0, 99));
    }
}
