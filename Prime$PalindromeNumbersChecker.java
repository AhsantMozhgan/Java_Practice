// Find 3-digit numbers that are not Palindrome, but they are prime number
public class Prime$PalindromeNumbersChecker {
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

    public static boolean isPrimeNumber (int number) {
        if (number % 2 == 0)
            return false;
        else {
            for (int i = 3; i * i <= number; i+=2) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int number;
        for (number = 1; number <= 999; number++) {
            if (isPrimeNumber(number) && !isPalindrome(number))
                System.out.print(number + "  " );
        }
    }
}
