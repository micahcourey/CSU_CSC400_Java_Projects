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
public class SelectionSortViewer {

    public static void arrayPrinter(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]  + " ");
        System.out.println();
    }

    public static void ascendingSelectionSort(int[] a, int n) {
        for (int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
        }
    }

    public static void descendingSelectionSort(int[] a, int m) {
        for (int index = 0; index < m - 1; index++) {
            int indexOfNextLargest = getIndexOfLargest(a, index, m - 1);
            swap(a, index, indexOfNextLargest);
        }
    }

    public static int getIndexOfSmallest(int[] a, int first, int last) {
        int min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index] < min) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    public static int getIndexOfLargest(int[] a, int first, int last) {
        int min = a[first];
        int indexOfMax = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index] > min) {
                min = a[index];
                indexOfMax = index;
            }
        }
        return indexOfMax;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


