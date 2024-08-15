//create a Java program that reads integers between 1 and 100 from the user and
// counts the occurrences of each number. The input will end when the user enters 0
import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101]; // Array to store counts of numbers from 1 to 100

        System.out.println("Enter numbers between 1 and 100 (end with 0):");

        while (true) {
            int number = scanner.nextInt();

            // End input if the number is 0
            if (number == 0) {
                break;
            }

            // Increment the count for the entered number if it's between 1 and 100
            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }
        }

        // Display the occurrences of each number
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }

        scanner.close();
    }
}