//Write a Java program that calculates the Greatest Common Divisor (GCD)
// of two numbers using the Euclidean algorithm:

import java.util.Scanner;

public class GreatestCommonDivisorCalculator {
    public static void main(String[] args) {
        // Declare variables to hold the two numbers and the remainder
        int a, b, r;

        // Create a Scanner object for reading input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first number: ");
        a = input.nextInt(); // Read the first number
        System.out.print("Enter the second number: ");
        b = input.nextInt(); // Read the second number

        // Store the original values of a and b for later use in the final output
        int t1 = a, t2 = b;

        // Calculate the initial remainder of a divided by b
        r = a % b;

        // Loop until the remainder is zero
        while (r != 0) {
            // Update a to the value of b
            a = b;
            // Update b to the value of the remainder
            b = r;
            // Print the current remainder
            System.out.println("Current remainder: " + r);
            // Calculate the new remainder of a divided by b
            r = a % b;
        }

        // Print a blank line for better readability
        System.out.println();

        // Print the original input values and the calculated GCD
        System.out.println("gcd(" + t1 + ", " + t2 + ") = " + b);

        // Close the Scanner object to free up resources
        input.close();
    }
}

//    The Euclidean algorithm is an efficient method for computing the greatest common divisor (GCD) of two numbers.
//
//        1. Purpose: It finds the largest positive integer that divides both numbers without a remainder.
//
//        2. Basic principle: The GCD of two numbers does not change if the larger number is replaced by its difference with the smaller number.
//
//        3. Algorithm steps:
//        - Divide the larger number by the smaller one
//        - Replace the larger number with the smaller number
//        - Replace the smaller number with the remainder from the division
//        - Repeat until the remainder is zero
//
//        4. Efficiency: It's very efficient, never requiring more steps than five times the number of digits of the smaller integer.
//
//        5. Example:
//        To find GCD(54, 888):
//        888 = 54 * 16 + 24
//        54 = 24 * 2 + 6
//        24 = 6 * 4 + 0
//        The GCD is 6, the last non-zero remainder.

