//a Java program that prompts the user to enter a number n and then prints a right-aligned
// triangle pattern of stars (*). The first row contains n stars, the second row
// contains n-1 stars, and so on, decreasing by one star per row.
import java.util.Scanner;

public class RightAlignedStarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");  // Print spaces for alignment
            }
            // for (int starNumber = 1; starNumber <= n - row+1; starNumber++)
            for (int starNumber = 1; starNumber <= n - (row-1); starNumber++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
