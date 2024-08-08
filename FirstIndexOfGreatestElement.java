//Find the first index of the greatest element in a list of numbers in Java
import java.util.Scanner;

public class FirstIndexOfGreatestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int N = input.nextInt();
        int [] a = new int [N];
//        int [] a = new int [5];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < a.length; i ++) {
            a[i] = input.nextInt();

        }

        int max_index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max_index])
                max_index = i;
        }
        // Enter the number of elements: 4
        // Enter the numbers: 2   6   3   6
        // The greatest element is 6 and its first occurrence is at index 1

        System.out.println("The greatest element is " + a[max_index] + " and its first occurrence is at index " + max_index);
    }
}
