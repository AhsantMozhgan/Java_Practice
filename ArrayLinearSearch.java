// write java program to perform linear search on an integer array
public class ArrayLinearSearch {

    // Method to perform linear search on an integer array
    public static int linearSearch(int[] array, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the target
            if (array[i] == target) {
                // Return the index of the target element if found
                return i;
            }
        }
        // Return -1 if the target element is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);  // Returns 1
        System.out.println(i);
        int j = linearSearch(list, -4); // Returns -1
        System.out.println(j);
        int k = linearSearch(list, -3); // Returns 5
        System.out.println(k);

    }
}