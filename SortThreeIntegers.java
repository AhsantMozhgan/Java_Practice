//write a Java program that asks the user to enter three integers
// and then sorts them in ascending order

import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");

        int num1, num2, num3;
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        // Sorting the three integers
//        If num1 is greater than num2, we swap them.
//        If num1 is greater than num3, we swap them.
//        If num2 is greater than num3, we swap them.
        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display the sorted integers
        System.out.println("The sorted integers are: " + num1 + ", " + num2 + ", " + num3);


//         OR
//         Sorting the three integers
//        int min, mid, max;
//
//        // Find the minimum
//        min = Math.min(Math.min(num1, num2), num3);
//
//        // Find the maximum
//        max = Math.max(Math.max(num1, num2), num3);
//
//        // Find the middle (sum of all numbers minus min and max)
//        mid = num1 + num2 + num3 - min - max;
//
//        // Display the sorted integers
//        System.out.println("The sorted integers are: " + min + ", " + mid + ", " + max);

        input.close();
    }
}
