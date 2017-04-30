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
public class InfixCalculatorTest {

    public static void main(String[] args) {
        System.out.println("Testing infix expressions with\n" +
                "data1 = 1\n" +
                "data2 = 2\n" +
                "data3 = 4\n" +
                "data4 = 5\n" +
                "data5 = 3\n");


        testInfixCalculator("data1 data2 + data3 * data4 -");
        testInfixCalculator("data1 data2 * data3 * data1 – / data4 data5* +");
        testInfixCalculator("(data1 + data2) * data5 - data3");
        testInfixCalculator("data5 + data4");
        testInfixCalculator("data3 * data2");
        testInfixCalculator("data4 / data2");
        testInfixCalculator("(data1 + data2) * data3");
        testInfixCalculator("data1 * data2 / (data3 - data4)");
        testInfixCalculator("data1 / data2 + (data3 - data4) * data5");
        testInfixCalculator("data5 + data5");
    }

    public static void testInfixCalculator(String infixExpression) {
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Value: " + InfixCalculator.evaluateInfix(infixExpression) + "\n");
    }
}
