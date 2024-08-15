//write a program in Java to check if two integer arrays are equal.

public class ArrayIsEqual {
    public static boolean areEqual(int [] a, int [] b) {
        if (a.length == b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a [i] != b [i])
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        int [] a = { 2, 7, 9, 3, 4};
        int [] b = { 2, 7, 9, 2, 4};
        System.out.println("Is these two Arrays Equal? " + areEqual(a, b));

    }
}



//// OR
//public class ArrayIsEqual {
//    public static boolean areEqual(int[] a, int[] b) {
//        // Check if both arrays are null
//        if (a == null && b == null) {
//            return true;
//        }
//
//        // Check if one of the arrays is null
//        if (a == null || b == null) {
//            return false;
//        }
//
//        // Check if the arrays have the same length
//        if (a.length != b.length) {
//            return false;
//        }
//
//        // Compare each element of the arrays
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != b[i]) {
//                return false;
//            }
//        }
//
//        // Arrays are equal
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int[] a = {2, 7, 9, 3, 4};
//        int[] b = {2, 7, 9, 2, 4};
//        System.out.println("Are these two arrays equal? " + areEqual(a, b)); // Output: false
//    }
//}