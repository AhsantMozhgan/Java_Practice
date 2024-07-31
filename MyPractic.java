import java.util.Scanner;

public class MyPractic {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        n = input.nextInt ();
        int f = 1;
        for (int i = 2; i <= n; i++)
            f = f * i;
        System.out.println (n + "! = " + f);
    }
}
