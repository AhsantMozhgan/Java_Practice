//write a Java program that takes a series of numbers as input from
// the user and then outputs those numbers in reverse order.
import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int N = input.nextInt();
        int[] a = new int[N];
//        int [] a = new int [5];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();

        }

        for (int i = a.length - 1; i >= 0; i--)
            System.out.println("   " + a[i]);
    }
}
