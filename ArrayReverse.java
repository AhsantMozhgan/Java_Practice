// Write a Java program that takes an integer array as input
// and outputs be a new array that is the reverse of the input array.

public class ArrayReverse {
    public static int [] reverse(int [] a) {
        int[] b = new int [a.length];

        for (int i = 0; i < a.length; i++) {
            b [a.length - i - 1] = a [i];

            // OR
//            for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
//                b[j] = a[i];
        }
        return b;
    }

    public static void print(int[] a) {
        System.out.print("[");
        for (int x:a)
            System.out.print("   " + x);
        System.out.println("]");
    }

    public static void main(String[] args) {
        int [] a = {2, 7, 9, 3};
        int [] b = reverse(a);
        print(a);
        print(b);
    }
}
