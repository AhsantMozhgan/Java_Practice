//create a Java program that prompts the user to enter a number between 0 and 1000
// and then calculates the sum of its digits

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");

        int number;
        number = input.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input! Please enter a number between 0 and 1000.");
        }
        else {
//            For example:
//            123 % 10 = 3 (last digit)
//            123 / 10 = 12 (removes last digit)
            int sum = 0;
            int digits;
            // Calculate the sum of the digits
            for (digits = number; digits > 0; digits /= 10) {
                sum += digits % 10;  // Add the last digit to the sum
                System.out.println(digits);
            }

            //  OR
            /*
            // Calculate the sum of the digits
            int sum = 0;
//            int digits = number;
//            The key concept here is using the modulo operator (%) to extract digits and
//            integer division (/=) to remove digits. For example:
//            123 % 10 = 3 (last digit)
//            123 / 10 = 12 (removes last digit)

            while (digits > 0) {
                sum += digits % 10; // Add the last digit to the sum
                digits /= 10;       // Remove the last digit
                System.out.println(digits);
            }
            */

            // Output the result
            System.out.println("The sum of the digits is " + sum);
        }
    }
}
