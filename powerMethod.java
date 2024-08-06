// crate power method to write a Java program that calculates 2 to the power of 3
// using the variables a and b, and incorporate a counter to keep track of the iterations
import java.util.Scanner;

public class powerMethod {
    public static int power (int a, int b) {
        int counter = 1;
        for (int i = 1; i <= b; i++)
            counter = counter * a;
        return counter;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        a = input.nextInt();

        System.out.print("Enter a power number: ");
        b = input.nextInt();

//        int pow = power(a, b);
        System.out.println(a + " ^ " + b + " = " + power(a, b));
    }
}
