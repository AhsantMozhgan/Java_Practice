import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int i, j;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        i = reader.nextInt();
        System.out.print("Enter second number: ");
        j = reader.nextInt();

        try {
            // Attempt to divide i by j. If j is 0, an ArithmeticException will occur.
            int k = i / j;

            // If no exception occurs, this line will execute and print the result of the division.
            System.out.println("" + i + " / " + j + " = " + k);

        } catch (RuntimeException e) {
            // This block will execute if any RuntimeException occurs in the try block.
            // Since dividing by zero causes an ArithmeticException, this message will be printed.
            System.out.println("Second number cannot be zero");
        }

    }
}
