/**
 Name: Micah Courey
 Project Name: CSC400-CTA5 Option #2
 Project Purpose: The program writes a given array backwards considering the first element of the array first.
 Algorithm Used: The reverseArray method uses recursion.
 Program Inputs: No user inputs are implemented, instead the ArrayReverserTest class is used to input arrays and test the method.
 Program Outputs: The program outputs the array and the array contents written backwards.
 Program Limitations: The program currently does not allow user input because it was not required in the assignment specifications.
 Program Errors: Error handling is not implemented.
 */

import java.util.Arrays;

public class ArrayReverserTest {
    public static void main(String[] args) {
        int[] oneToTen = {1,2,3,4,5,6,7,8,9,10};
        int[] tenToOne = {10,9,8,7,6,5,4,3,2,1};
        int[] tenToThirty = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        System.out.println("Testing writing an array backwards");
        testArrayReverser(oneToTen, 0, 9);
        testArrayReverser(tenToOne, 0, 9);
        testArrayReverser(tenToThirty, 0, 20);

    }

    public static void testArrayReverser(int[] myArray, int startInt, int endInt) {
        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.print("Backwards Output: ");
        ArrayReverser.reverseArray(myArray, startInt, endInt);
        System.out.println("\n");
    }
}
