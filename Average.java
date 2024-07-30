import java.util.Scanner;

public class Average {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in); // read from keyboard
        int a, b;
        System.out.println("Please enter the first number: ");
        a = input.nextInt();        // before we typed a = 5 but now read from keyboard;
        System.out.println("Please enter the second number: ");
        b = input.nextInt();        // before we typed b = 15 but now read from keyboard;

//        int avg = a + b / 2;        // false
        int avg = (a + b) / 2;      // true because of parenthesis
        System.out.println("The average of " + a + " and " + b + " is equal to : " + avg);
    }
}
