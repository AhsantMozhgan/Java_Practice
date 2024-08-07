//create PrimeNumber method to check if a number is prime or not prime
public class PrimeNumberCheckerMethod {
    public static boolean isPrimeNumber (int number) {
        if (number % 2 == 0)
            return false;
        else {
            for (int i = 3; i * i <= number; i+=2) {
//                System.out.print(i + "    ");
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number;
        for (number = 100; number <= 999; number++) {
            if (isPrimeNumber(number))
                System.out.print(number + "  " );
        }
    }
}

// Find 3-digit numbers that are not symmetrical

