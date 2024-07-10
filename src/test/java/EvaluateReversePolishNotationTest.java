import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.EvaluateReversePolishNotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation evaluateReversePolishNotation;

    @BeforeEach
    void setUp(){
        evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    }

    @Test
    void evalRPN_9(){
        assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2","1","+","3","*"}));
    }

    @Test
    void evalRPN_6(){
        assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[]{"4","13","5","/","+"}));
    }

    @Test
    void evalRPN_22(){
        assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
