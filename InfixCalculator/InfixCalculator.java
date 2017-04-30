/**
 Name: Micah Courey
 Project Name: CSC400-CTA4 Option #2
 Project Purpose: A Infix calculator that accepts 5 elements (data1, data2, data3, data4, data5)
                  and will perform an appropriate infix operation
 Algorithm Used: The Stack ADT is implemented in this program
 Program Inputs: No user inputs are implemented, instead the InfixCalculatorTest class is used to input items and test methods.
 Program Outputs: The program outputs the Infix Expression and it's value
 Program Limitations: The program currently does not allow user input because it was not required in the assignment specifications.
 Program Errors: Error handling is not implemented
 */

import java.util.Stack;

public class InfixCalculator {

    public static double evaluateInfix(String infix) {
        Double operandOne, operandTwo, result;
        Character top;
        char topOperator;
        int characterCount = infix.length();
        Stack<Character> operatorStack = new Stack<>();
        Stack<Double> valueStack = new Stack<>();

        for (int index = 0; index < characterCount; index++) {
            char nextCharacter = infix.charAt(index);

            switch(nextCharacter) {
                case '1' :case '2' :case '3' :case '4' :case '5':
                    valueStack.push(valueOf(nextCharacter));
                    break;

                case '(':case '^':
                    operatorStack.push(nextCharacter);
                    break;

                case ')':
                    top = operatorStack.pop();
                    topOperator = top;

                    while (topOperator != '(') {
                        operandTwo = valueStack.pop();
                        operandOne = valueStack.pop();
                        result = compute(operandOne, operandTwo, topOperator);
                        valueStack.push(result);
                        top = operatorStack.pop();
                        topOperator = top;
                    }
                    break;

                case '+': case '-': case '*': case '/':
                    boolean done = false;
                    while (!operatorStack.empty() && !done) {
                        top = operatorStack.peek();
                        topOperator = top;

                        if (precedence(nextCharacter) <= precedence(topOperator) ) {
                            operatorStack.pop();
                            operandTwo = valueStack.pop();
                            operandOne = valueStack.pop();
                            result = compute(operandOne, operandTwo, topOperator);
                            valueStack.push(result);
                        }
                        else
                            done = true;
                    }

                    operatorStack.push(nextCharacter);
                    break;

                default: break;
            }
        }

        while (!operatorStack.empty()) {
            top = operatorStack.pop();
            topOperator = top;
            operandTwo = valueStack.pop();
            operandOne = valueStack.pop();
            result = compute(operandOne, operandTwo, topOperator);
            valueStack.push(result);
        }

        result = valueStack.peek();
        return result;
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '(': case ')': return 0;
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
        }

        return -1;
    }

    private static double valueOf(char variable) {
        final int data1 = 1;
        final int data2 = 2;
        final int data3 = 4;
        final int data4 = 5;
        final int data5 = 3;

        switch (variable) {
            case '1': return data1;
            case '2': return data2;
            case '3': return data3;
            case '4': return data4;
            case '5': return data5;
        }

        return 0;
    }

    private static Double compute(Double operandOne, Double operandTwo, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = operandOne + operandTwo;
                break;

            case '-':
                result = operandOne - operandTwo;
                break;

            case '*':
                result = operandOne * operandTwo;
                break;

            case '/':
                result = operandOne / operandTwo;
                break;

            case '^':
                result = Math.pow(operandOne, operandTwo);
                break;

            default:
                result = 0;
                break;
        }

        return result;
    }
}

