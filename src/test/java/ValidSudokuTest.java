import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ValidSudoku;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidSudokuTest {
    ValidSudoku validSudoku;

    @BeforeEach
    void setUp() {
        validSudoku = new ValidSudoku();
    }

    @Test
    void isValidSudoku_True(){
        assertTrue(validSudoku.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}}));
    }
}
