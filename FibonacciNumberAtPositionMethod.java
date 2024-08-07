import java.util.Scanner;

public class FibonacciNumberAtPositionMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position number that starts from 1: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Position must be a positive integer.");
        }

        System.out.println("The Fibonacci number at position " + number + " is " + fibonacci(number) + ".");
    }

    public static int fibonacci (int number) {
        int a = 1, b = 1;
        int next;
        for (int i = 2; i <= number; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
