// Write a Java program where the user inputs a position, and the program outputs the Fibonacci number at that position.

import java.util.Scanner;

public class FibonacciNumberAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position number that starts from 1: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Position must be a positive integer.");
        }

        int a = 1, b = 1;
        int next;
        for (int i = 2; i < number; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println("The Fibonacci number at position " + number + " is " + b + ".");
    }
}
