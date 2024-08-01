import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is not a prime number.");
            else {
                boolean isPrime = true;
                for (int i = 3; i * i <= number && isPrime; i+=2) {  // "isPrime" or "isPrime == true"
                    System.out.println(i + " ");
                    if (number % i == 0)
                        isPrime = false;
                }
                if (isPrime)
                    System.out.println(number + " is a prime number.");
                else {
                    System.out.println(number + " is not a prime number.");
                }
        }

//
//        boolean isPrime = true;
//
//        // Check if number is less than 2, which are not prime numbers
//        if (number < 2) {
//            isPrime = false;
//        } else {
//            // Check for factors from 2 to the square root of the number
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        // Output the result
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
    }
}
