import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.Triangle;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp(){
        triangle = new Triangle();
    }

    @Test
    void minimumTotal_11(){
        List<Integer> first = new LinkedList<>();
        first.add(2);
        List<Integer> second = new LinkedList<>();
        second.add(3);
        second.add(4);
        List<Integer> third = new LinkedList<>();
        third.add(6);
        third.add(5);
        third.add(7);
        List<Integer> fourth = new LinkedList<>();
        fourth.add(4);
        fourth.add(1);
        fourth.add(8);
        fourth.add(3);
        List<List<Integer>> input = new LinkedList<>();
        input.add(first);
        input.add(second);
        input.add(third);
        input.add(fourth);
        assertEquals(11, triangle.minimumTotal(input));
    }
}
