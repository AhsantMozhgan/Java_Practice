import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (int row = 1; row <= number; row++) {
            for (int i = 1; i <= number; i++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
