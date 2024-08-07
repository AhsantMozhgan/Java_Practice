import java.util.Scanner;

public class PalindromeCheckerMethod {
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

        boolean result = isPalindrome(number);
        if (result)
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not palindrome");
    }

//        int number;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        number = input.nextInt();
//
//        int t = number;
//        int reversedNumber = 0;
//        while (number != 0) {
//            reversedNumber = reversedNumber * 10 + number % 10;  // Append the digit to the reversed number
//            number = number / 10;  // Remove the last digit from the number
//        }
//        if (t == reversedNumber)
//            System.out.println("Palindrome: Yes!");
//        else
//            System.out.println("Palindrome: No");
}



