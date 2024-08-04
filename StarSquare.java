//a simple Java program that prompts the user to enter a number and then prints a square pattern of stars (*),
// where the number of rows and columns is equal to the entered number.
import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}




