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

public class ArrayReverser {

    public static int[] reverseArray(int[] array, int start, int end) {
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArray(array, start + 1, end - 1);
        }
        else {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
        return array;
    }
}