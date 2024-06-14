import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTest {
    Logger logger;

    @BeforeEach
    void setUp(){
        logger = new Logger();
    }

    @Test
    void printSomeMessages(){
        assertTrue(logger.shouldPrintMessage(1,"foo"));
        assertTrue(logger.shouldPrintMessage(2,"bar"));
        assertFalse(logger.shouldPrintMessage(3,"foo"));
        assertFalse(logger.shouldPrintMessage(8,"bar"));
        assertFalse(logger.shouldPrintMessage(10,"foo"));
        assertTrue(logger.shouldPrintMessage(11,"foo"));
    }
}
