import java.util.InputMismatchException; // Import for handling invalid input exceptions
import java.util.Scanner; // Import for getting user input

public class Exception {
    public static void main(String[] args) {
        int i, j; // Declare two integers for user input
        Scanner reader = new Scanner(System.in); // Create a Scanner object for user input

        try {
            // Ask the user to input the first number
            System.out.print("Enter first number: ");
            i = reader.nextInt(); // Get the first number from user

            // Ask the user to input the second number
            System.out.print("Enter second number: ");
            j = reader.nextInt(); // Get the second number from user

            // Attempt to divide i by j. If j is 0, an ArithmeticException will occur.
            int k = i / j;

            // If no exception occurs, print the result of the division.
            System.out.println("" + i + " / " + j + " = " + k);

        } catch (ArithmeticException e) {
            // This block will catch ArithmeticException, which occurs if j is zero (division by zero)
            System.out.println("Second number cannot be zero");
        } catch (InputMismatchException e) {
            // This block will catch InputMismatchException, which occurs if the user inputs non-numeric values
            System.out.println("Input must be a number");

            // Terminate the program in case of invalid input, as the following logic depends on valid inputs
            return; // Code after this return statement (System.out.println("Bye Bye")) will not execute
        } finally {
            // This block will always execute, regardless of whether an exception occurred or not
            System.out.println("This is the finally block");
        }

        // This line will execute if no exception occurred or if an ArithmeticException was caught
        System.out.println("Bye Bye");
    }
}