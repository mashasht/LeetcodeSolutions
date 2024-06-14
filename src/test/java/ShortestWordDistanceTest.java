import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ShortestWordDistance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordDistanceTest {
    ShortestWordDistance shortestWordDistance;

    @BeforeEach
    void setUp(){
        shortestWordDistance = new ShortestWordDistance();
    }

    @Test
    void shortestDistance_codingPractice(){
        assertEquals(3, shortestWordDistance.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
    }
}
