/**
 Name: Micah Courey
 Project Name: CSC400-CTA6 Option #1
 Project Purpose: The program performs a selection sort on an array and it displays each step in the sorting process in both ascending and descending order.
 Algorithm Used: The selection sort algorithm is used.
 Program Inputs: No user inputs are implemented, instead the SelectionSortViewerTest class is used to input arrays and test the methods.
 Program Outputs: The program outputs the original array and the all steps in the sorting process.
 Program Limitations: The program currently does not allow user input because it was not required in the assignment specifications.
 Program Errors: Error handling is not implemented.
 */
public class SelectionSortViewerTest {

    public static void main(String[] args) {
        int[] array = {5, 7, 4, 9, 8, 5, 6, 3};
        int[] descArray = {5, 7, 4, 9, 8, 5, 6, 3};
        int n = 1;
        int m = 1;

        System.out.println("The array before sorting:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]  + " ");
        System.out.println();

        System.out.println("\nThe array during each step of the ascending order selection sort process:");

        for (int i = 1; i <= array.length; i++) {
            System.out.print("Step " + i + ": ");
            SelectionSortViewer.ascendingSelectionSort(array, n);
            SelectionSortViewer.arrayPrinter(array);
            n++;
        }

        System.out.println("\nThe array during each step of the descending order selection sort process:");

        for (int i = 1; i <= descArray.length; i++) {
            System.out.print("Step " + i + ": ");
            SelectionSortViewer.descendingSelectionSort(descArray, m);
            SelectionSortViewer.arrayPrinter(descArray);
            m++;
        }
    }
}
