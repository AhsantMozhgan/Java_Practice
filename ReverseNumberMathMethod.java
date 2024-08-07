//Write a simple Java program to reverse a number using a mathematical algorithm (using method)

import java.util.Scanner;

public class ReverseNumberMathMethod {
    public static int reverseNumberMath (int N) {
        int reversedNumber = 0;
        while (N !=0) {
            reversedNumber = reversedNumber * 10 + N % 10;  // Append the digit to the reversed number
            N = N / 10;  // Remove the last digit from the number
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a;
        a = input.nextInt();

        System.out.println(reverseNumberMath(a));
    }
}
