//Write a program that displays the first, 50 prime numbers
// in five lines, each of which contains ten numbers.

public class DisplayingPrimeNumbers {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while(count < 50) {
            if (number % 2!= 0) {
                boolean isPrime = true;
                for (int i = 3; i * i <= number && isPrime; i+=2)
                    if (number % i == 0)
                        isPrime = false;

                if (isPrime) {
                    System.out.printf(number + "   ");
                    count++;
                    if (count % 10 == 0)
                        System.out.println();
                }
            }
            number++;
        }
    }
}
