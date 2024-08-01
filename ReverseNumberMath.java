import java.util.Scanner;

//Write a simple Java program to reverse a number using a mathematical algorithm
public class ReverseNumberMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int N;
        N = input.nextInt();
        int reversedNumber = 0;
        while (N !=0) {
            reversedNumber = reversedNumber * 10 + N % 10;  // Append the digit to the reversed number
            N = N / 10;  // Remove the last digit from the number
        }
        System.out.println("Reversed Number: " + reversedNumber);
    }

}
