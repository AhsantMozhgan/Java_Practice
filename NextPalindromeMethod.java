//write a Java program that finds the first palindromic number greater than a given number n.
// For example if n is 124, the next Palindrome number is 131
import java.util.Scanner;

public class NextPalindromeMethod {
    public static int nextPalindrome (int N) {
        while (true) {
            N++;
            if (isPalindrome(N))
                return N;
        }
    }
    public static boolean isPalindrome (int N) {
        int rev = reverseNumberMath(N);
        if (N == rev)
            return true;
        else
            return false;
    }

    public static int reverseNumberMath (int N) {
        int reversedNumber = 0;
        while (N !=0) {
            reversedNumber = reversedNumber * 10 + N % 10;  // Append the digit to the reversed number
            N = N / 10;  // Remove the last digit from the number
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = input.nextInt();

        System.out.println(nextPalindrome(number));
    }

}
