////write Java program that asks the user to enter three numbers and then
//// finds the maximum among them:
//
import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        int num1, num2, num3;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        // Find the maximum number
        int max = num1;     // Assume the first number is the maximum
        if (num2 > max){
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Display the result
        System.out.println("The maximum number is: " + max);

        input.close();
    }
}
