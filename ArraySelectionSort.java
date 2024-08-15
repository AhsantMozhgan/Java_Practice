//write the selection sort algorithm in Java to sort an array of integers in ascending order

//Selection sort is not optimal for large datasets due to its O(n^2) time complexity, but
// its simplicity makes it a good choice for small lists or when memory writes are costly.

public class ArraySelectionSort {

    // Method to perform selection sort on an integer array
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Iterate over each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
