import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = input.nextInt();

        int t = number;
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;  // Append the digit to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }
        if (t == reversedNumber)
            System.out.println("Palindrome: Yes!");
        else
            System.out.println("Palindrome: No");
    }
}
