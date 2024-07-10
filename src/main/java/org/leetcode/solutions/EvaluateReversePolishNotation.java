package org.leetcode.solutions;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+": {
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                }
                case "-": {
                    int second = numbers.pop();
                    int first = numbers.pop();
                    numbers.push(first - second);
                    break;
                }
                case "*": {
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                }
                case "/": {
                    int second = numbers.pop();
                    int first = numbers.pop();
                    numbers.push(first / second);
                    break;
                }
                default: {
                    numbers.push(Integer.parseInt(str));
                }
            }
        }
        return numbers.pop();
    }
}
