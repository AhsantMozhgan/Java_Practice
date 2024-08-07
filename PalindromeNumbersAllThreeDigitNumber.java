//Write a Java program that prints all 3-digit palindrome numbers:

import java.util.Scanner;

public class PalindromeNumbersAllThreeDigitNumber {
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
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        number = input.nextInt();
        for (number = 100; number <= 999; number++) {
            if (isPalindrome(number))
                System.out.print(number + "  " );
        }

//        boolean result = isPalindrome(number);
//        if (result)
//            System.out.println(number + " is palindrome");
//        else
//            System.out.println(number + " is not palindrome");
    }
}
