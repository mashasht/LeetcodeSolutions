import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.GameOfLife;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeTest {
    GameOfLife gameOfLife;

    @BeforeEach
    void setUp(){
        gameOfLife = new GameOfLife();
    }

    @Test
    void gameOfLife_4cells(){
        int[][] result = new int[][]{{1,1},{1,0}};
        gameOfLife.gameOfLife(result);
        assertArrayEquals(new int[][]{{1,1},{1,1}}, result);
    }

    @Test
    void gameOfLife_9cells(){
        int[][] result = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife.gameOfLife(result);
        assertArrayEquals(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}}, result);
    }
}
