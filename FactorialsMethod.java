import java.util.Scanner;

public class FactorialsMethod {
    public static int factorial (int N) {
        int f = 1;
        for (int i = 2; i <= N; i++)
            f = f * i;
        return f;
    }
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number for m: ");
        m = input.nextInt ();
        System.out.print("Enter a number for n: ");
        n = input.nextInt ();
        int combination = factorial(m) / (factorial(n) * factorial(m - n));

//        System.out.println("Factorial of " + m + " is: " + factorial(m));
        System.out.println("C("+m+", "+n+") = "+combination);
    }
}
