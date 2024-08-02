//Write a Java code which generates and prints a multiplication table from 1 to 9:

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tMultiplication Table ");
//        System.out.print("\t");
//        for (int i = 1; i <= 9;i++)
//        System.out.print("\t" + i);
//        System.out.println();
        System.out.println("           1   2   3   4   5   6   7   8   9   ");
        for (int i = 0; i < 50; i++)
            System.out.print("-");
        System.out.println();

        for (int row = 1; row <= 9; row++) {
            System.out.print(row + "   |   ");
            for (int column = 1; column <= 9; column++) {
//                System.out.print("  " + row * column);
                // Print the product of the current row and column, formatted to align correctly
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
    }
}
