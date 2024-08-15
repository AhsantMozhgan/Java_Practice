//write a binary search algorithm in Java to efficiently find an element in a sorted array

// Binary search is much more efficient than linear search for large arrays,
// with a time complexity of O(log n), compared to O(n) for linear search.
// However, it requires that the array be sorted beforehand.
public class ArrayBinarySearch {

    // Method to perform binary search on a sorted integer array
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Starting index of the search interval
        int right = array.length - 1; // Ending index of the search interval

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the target is present at the mid index
            if (array[mid] == target) {
                return mid; // Return the index if the target is found
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        // Define a sorted array to search within
        int[] sortedArray = {1, 2, 3, 4, 7, 9, 11, 13};

        // Define the target element to search for
        int target = 9;

        // Perform binary search and store the result
        int result = binarySearch(sortedArray, target);

        // Check if the target element was found and print the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}