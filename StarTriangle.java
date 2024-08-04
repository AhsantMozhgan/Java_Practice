//write a Java program that prompts the user to enter a number n and then prints a
// right-angled triangle pattern of stars (*), where the number of rows is equal to
// the entered number, and the number of stars in each row starts from 1 and increases up to n.
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
