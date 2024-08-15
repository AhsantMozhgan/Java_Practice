//write a Java program to merge two integer arrays into a single array and print the result?

public class ArrayMerge {

    // Method to merge two integer arrays into a single array
    public static int[] mergeArray(int[] a, int[] b) {
        // Create a new array with a length equal to the sum of the two arrays' lengths
        int[] c = new int[a.length + b.length];

        // Copy elements from the first array into the new array
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements from the second array into the new array, starting after the last element of the first array
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        // Return the merged array
        return c;
    }

    // Method to print the elements of an array
    public static void print(int[] a) {
        System.out.print("[");
        // Iterate through each element in the array and print it
        for (int x : a) {
            System.out.print(" " + x);
        }
        System.out.println(" ]");
    }

    // Main method to test the merging and printing of arrays
    public static void main(String[] args) {
        // Define two arrays to be merged
        int[] a = {2, 7, 9, 3, 4};
        int[] b = {1, 11, 13};

        // Merge the arrays
        int[] c = mergeArray(a, b);

        // Print the original and merged arrays
        print(a); // Output: [ 2 7 9 3 4 ]
        print(b); // Output: [ 1 11 13 ]
        print(c); // Output: [ 2 7 9 3 4 1 11 13 ]
    }
}