import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.ExcelTitleToNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelTitleToNumberTest {
    ExcelTitleToNumber excelTitleToNumber;

    @BeforeEach
    void setUp(){
        excelTitleToNumber = new ExcelTitleToNumber();
    }

    @Test
    void titleToNumber_AB(){
        assertEquals(28, excelTitleToNumber.titleToNumber("AB"));
    }
}
